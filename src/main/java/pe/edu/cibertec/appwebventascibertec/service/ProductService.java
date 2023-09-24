package pe.edu.cibertec.appwebventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebventascibertec.model.bd.Category;
import pe.edu.cibertec.appwebventascibertec.model.bd.Product;
import pe.edu.cibertec.appwebventascibertec.model.bd.Supplier;
import pe.edu.cibertec.appwebventascibertec.model.request.ProductRequest;
import pe.edu.cibertec.appwebventascibertec.model.response.ResultadoResponse;
import pe.edu.cibertec.appwebventascibertec.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> listarProductos(){
        return productRepository.findAll();
    }

    public ResultadoResponse guardarProducto(ProductRequest product){
        String mensaje = "Producto registrado correctamente";
        Boolean respuesta = true;
        try {
            Product objProduct = new Product();
            if(product.getProductid() > 0){
                objProduct.setProductid(product.getProductid());
            }
            objProduct.setProductname(product.getProductname());
            objProduct.setUnitprice(product.getUnitprice());
            Boolean discontinued = false;
            if(product.getDiscontinued() != null){
                discontinued = product.getDiscontinued();
            }
            objProduct.setDiscontinued(discontinued);
            Category category = new Category();
            category.setCategoryid(product.getCategoryid());
            Supplier supplier = new Supplier();
            supplier.setSupplierid(product.getSupplierid());
            objProduct.setCategories(category);
            objProduct.setSuppliers(supplier);
            productRepository.save(objProduct);
        }catch (Exception ex){
            mensaje = "Producto no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

}
