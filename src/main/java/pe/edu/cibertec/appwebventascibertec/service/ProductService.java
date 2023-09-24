package pe.edu.cibertec.appwebventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebventascibertec.model.bd.Product;
import pe.edu.cibertec.appwebventascibertec.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> listarProductos(){
        return productRepository.findAll();
    }

    public Boolean guardarProducto(Product product){
        return productRepository.save(product) == null;
    }

}
