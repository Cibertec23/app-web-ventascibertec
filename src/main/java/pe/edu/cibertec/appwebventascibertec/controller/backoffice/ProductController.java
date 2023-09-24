package pe.edu.cibertec.appwebventascibertec.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appwebventascibertec.model.bd.Product;
import pe.edu.cibertec.appwebventascibertec.model.request.ProductRequest;
import pe.edu.cibertec.appwebventascibertec.model.response.ResultadoResponse;
import pe.edu.cibertec.appwebventascibertec.service.ProductService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listaProductos",
                productService.listarProductos());
        return "backoffice/product/frmMantProduct";
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Product> listarProductos(){
        return productService.listarProductos();
    }
    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarProducto(
            @RequestBody ProductRequest productRequest
            ){
        return productService.guardarProducto(productRequest);
    }



}
