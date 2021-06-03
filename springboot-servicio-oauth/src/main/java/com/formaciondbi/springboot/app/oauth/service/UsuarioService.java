package com.formaciondbi.springboot.app.oauth.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.formaciondbi.springboot.app.comunes.usuarios.models.entidad.Usuario;
import com.formaciondbi.springboot.app.oauth.clients.UsuarioFeignClient;



@Service
public class UsuarioService implements IusuarioService{

	private Logger log = LoggerFactory.getLogger(UsuarioService.class);
	@Autowired
	private UsuarioFeignClient client;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = client.findByUsername(username);
		
		if(usuario == null) {
			log.error("Error de loggin, no se encontro al usuario"
					+ " '"+usuario+"' en el sistema");
			throw new UsernameNotFoundException("Error de loggin, no se encontro al usuario"
					+ " '"+usuario+"' en el sistema");
		}
		
		
		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> log.info("Auth: " + authority.getAuthority()))
				.collect(Collectors.toList());
		
		log.info("Username: " + username);
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(),
				true, true, true, authorities);
	}

	@Override
	public Usuario findByUsername(String username) {

		return client.findByUsername(username);
	}

}
