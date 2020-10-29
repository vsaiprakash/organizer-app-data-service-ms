package com.backend.organizerappdataservicems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//Configuration
@Configuration
//Enable Swagger
@EnableSwagger2
public class SwaggerConfig {

	/*
		Swagger UI URL
		http://localhost:3000/swagger-ui.html
		Other URLs
		http://localhost:3000/v2/api-docs
	*/
	
	//Bean - Docket
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2);
	}
	//Swagger 2
	//All paths
	//All apis

}
