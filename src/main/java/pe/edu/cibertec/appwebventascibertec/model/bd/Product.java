package pe.edu.cibertec.appwebventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    private Integer productid;
    @Column(name = "productname")
    private String productname;
    @Column(name = "quantityperunit")
    private String quantityperunit;
    @Column(name = "unitprice")
    private Double unitprice;
    @Column(name = "unitsintstock")
    private Integer unitsintstock;
    @Column(name = "unitsonorder")
    private Integer unitsonorder;
    @Column(name = "reorderlevel")
    private Integer reorderlevel;
    @Column(name = "descontinued")
    private Boolean descontinued;
    @ManyToOne
    @JoinColumn(name = "supplierid")
    private Supplier suppliers;
    @ManyToOne
    @JoinColumn(name = "categoryid")
    private Category categories;


}
