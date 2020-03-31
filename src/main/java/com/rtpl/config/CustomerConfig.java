package com.rtpl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rtpl.core.CustomerBo;

@Configuration
public class CustomerConfig {
	@Bean(name="customer")
		public CustomerBo customerBo(){
			
			return new CustomerBo();
		
	}
	
}
