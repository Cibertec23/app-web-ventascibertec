package pe.edu.cibertec.appwebventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebventascibertec.model.bd.Product;
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
        return null;
    }

}
