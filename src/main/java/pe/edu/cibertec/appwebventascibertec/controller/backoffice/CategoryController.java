package pe.edu.cibertec.appwebventascibertec.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.cibertec.appwebventascibertec.model.bd.Category;
import pe.edu.cibertec.appwebventascibertec.service.CategoryService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/category")
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("/listar")
    @ResponseBody
    public List<Category> listarCategorias(){
        return categoryService.listarCategorias();
    }

}
