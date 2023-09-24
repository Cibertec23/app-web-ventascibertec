package pe.edu.cibertec.appwebventascibertec.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appwebventascibertec.model.bd.Supplier;
import pe.edu.cibertec.appwebventascibertec.repository.SupplierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierService {
    private SupplierRepository supplierRepository;

    public List<Supplier> listarProveedores(){
        return supplierRepository.findAll();
    }

}
