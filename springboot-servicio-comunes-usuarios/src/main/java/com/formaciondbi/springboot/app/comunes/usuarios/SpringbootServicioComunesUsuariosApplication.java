package com.formaciondbi.springboot.app.comunes.usuarios;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringbootServicioComunesUsuariosApplication {

}
