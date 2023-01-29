package com.registro.usuarios.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;
import com.registro.usuarios.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;


public interface UsuarioServicio extends UserDetailsService{
    
 

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
        
	public List<Usuario> listarUsuarios();
        
    	
}
