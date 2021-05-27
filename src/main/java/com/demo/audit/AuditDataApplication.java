package com.demo.audit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuditDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditDataApplication.class, args);
	}

}
