package com.bloom.crudTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudTestApplication.class, args);
	}

}

