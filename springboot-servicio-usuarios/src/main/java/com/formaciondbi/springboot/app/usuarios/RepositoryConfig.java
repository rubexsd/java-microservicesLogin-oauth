package com.formaciondbi.springboot.app.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.formaciondbi.springboot.app.comunes.usuarios.models.entidad.Role;
import com.formaciondbi.springboot.app.comunes.usuarios.models.entidad.Usuario;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Role.class);
	}

	
}
