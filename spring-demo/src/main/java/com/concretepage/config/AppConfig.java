package com.concretepage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.concretepage")/*Me escanea el paquete com.concretepage*/
@EnableWebMvc
public class AppConfig {

	@Bean/*Bean fuera del metodo*/
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/secure/");/*Prefijos para los mapeos de los archivos y de la carpeta*/
		resolver.setSuffix(".jsp");/*El formato del archivo y te busca todo lo que tenga .jsp*/
		
		return resolver;
	}

}
