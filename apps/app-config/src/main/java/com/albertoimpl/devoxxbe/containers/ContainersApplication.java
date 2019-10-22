package com.albertoimpl.devoxxbe.containers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@Value("${greeter.message}")
	private String value;

	@RequestMapping("/message")
	public String message() {
		return value;
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
