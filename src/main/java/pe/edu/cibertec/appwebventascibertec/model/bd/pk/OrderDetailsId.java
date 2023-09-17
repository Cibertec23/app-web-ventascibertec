package pe.edu.cibertec.appwebventascibertec.model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@Embeddable
public class OrderDetailsId implements Serializable {

    private Integer orderid;
    private Integer productid;
}
