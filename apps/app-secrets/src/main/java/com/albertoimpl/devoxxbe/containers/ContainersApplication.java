package com.albertoimpl.devoxxbe.containers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@RequestMapping("/secret")
	public String message() {
		return System.getenv().getOrDefault("DB_PASSWORD", "Not found");
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
