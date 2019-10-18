package com.albertoimpl.devoxxbe.containers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello, All";
	}


	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
