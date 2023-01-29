package com.registro.usuarios.controlador;

import com.registro.usuarios.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;
import com.registro.usuarios.servicio.UsuarioServicioImpl;
import java.util.List;
import org.springframework.data.repository.query.Param;

@Controller
public class RegistroControlador {
    @Autowired
       private UsuarioServicioImpl usuarioServicioimpl;
	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
           
                
		return "login";
	}
	
		@GetMapping("/index")
	public String verPaginaDeInicio(Model modelo,@Param("username") String username) {
          
        
                 List<Usuario> listar = usuarioServicioimpl.ListAll(username);
            
           
		modelo.addAttribute("usuario", listar);
                 modelo.addAttribute("username",username);
		return "index";
	}
        
        @GetMapping({"/","/home"})
	public String home() {
		
		return "home";
	}
}

