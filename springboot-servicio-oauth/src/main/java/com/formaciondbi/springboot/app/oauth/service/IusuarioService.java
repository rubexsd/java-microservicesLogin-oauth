package com.formaciondbi.springboot.app.oauth.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.formaciondbi.springboot.app.comunes.usuarios.models.entidad.Usuario;

public interface IusuarioService extends UserDetailsService{

	public Usuario findByUsername(String username);
}
