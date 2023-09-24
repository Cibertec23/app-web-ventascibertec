package pe.edu.cibertec.appwebventascibertec.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.appwebventascibertec.model.bd.Supplier;
import pe.edu.cibertec.appwebventascibertec.service.SupplierService;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/supplier")
public class SupplierController {

    private SupplierService supplierService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Supplier> listarProveedores(){
        return supplierService.listarProveedores();
    }

}
