package pe.edu.cibertec.appwebventascibertec.model.request;

import lombok.Data;

@Data
public class ProductRequest {
    private Integer productid;
    private String productname;
    private Double unitprice;
    private Boolean discontuned;
    private Integer supplierid;
    private Integer categoryid;
}
