package pe.edu.cibertec.appwebventascibertec.controller.frontoffice;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appwebventascibertec.model.bd.Usuario;
import pe.edu.cibertec.appwebventascibertec.service.UsuarioService;

@AllArgsConstructor
@Controller
@RequestMapping("/auth")
public class LoginController {

    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login(){
        return "frontoffice/auth/frmLogin";
    }

    /*@PostMapping("/login-success")
    public String loginSuccess(HttpServletRequest request) {
        // Get the authenticated user's details
        UserDetails userDetails = (UserDetails) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
        HttpSession session = request.getSession();
        session.setAttribute("username", userDetails.getUsername());
        // Comprueba si el objeto UserDetails es una instancia de tu clase Usuario
        if (userDetails instanceof Usuario) {
            // Convierte el UserDetails a tu clase Usuario
            Usuario usuario = (Usuario) userDetails;

            // Ahora puedes acceder a los atributos específicos de tu clase Usuario
            String username = usuario.getNombres();
            // Realiza cualquier otra operación que necesites con el objeto Usuario
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
        } else {
            // Manejar el caso en que el UserDetails no sea una instancia de tu clase Usuario
            HttpSession session = request.getSession();
            session.setAttribute("username", userDetails.getUsername());
        }

        // Store user information in the HttpSession


        return "redirect:/auth/home";
    }*/


    @GetMapping("/registrar")
    public String registrar(){
        return "frontoffice/auth/frmRegistroUsuario";
    }

    @PostMapping("/guardarUsuario")
    public String guardarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUser(usuario);
        return "frontoffice/auth/login";
    }
    @GetMapping("/home")
    public String home(){
        return "frontoffice/home";
    }
}
