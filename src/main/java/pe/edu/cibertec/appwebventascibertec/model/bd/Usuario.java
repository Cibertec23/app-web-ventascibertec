package pe.edu.cibertec.appwebventascibertec.model.bd;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    @Column(name = "nomusuario")
    private String nomusuario;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "activo")
    private Boolean activo;
    @ManyToMany(cascade =  CascadeType.MERGE,
            fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns =
        @JoinColumn(name = "idusuario"),
        inverseJoinColumns = @JoinColumn(name = "idrol"))
    private Set<Rol> roles;


}
