package com.hospital_system.utility;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class AllConfigurations {

	@Bean
	public ModelMapper modelmapper() {
		
		return new ModelMapper();
	}
	
	@Bean
   public OpenAPI swaggers() {
	   return new OpenAPI().info(new Info()
			   .description("these is a hospital management project developed to manage all the operations effectively")
			   .title("hospital-management-project")
			   .version("1.0"));
   }
	
}
