package com.stream.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStreamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStreamBackendApplication.class, args);
		System.out.println("Spring Boot WebFlux Streaming Backend is up and running...");
	}

}
