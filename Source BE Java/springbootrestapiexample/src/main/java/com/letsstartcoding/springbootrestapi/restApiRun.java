package com.letsstartcoding.springbootrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class restApiRun {
	
	public static void main(String[] args) {
		SpringApplication.run(restApiRun.class, args);
	}

}
