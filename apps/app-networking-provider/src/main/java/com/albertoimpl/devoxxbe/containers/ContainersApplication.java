package com.albertoimpl.devoxxbe.containers;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@RequestMapping("/customers")
	public List<String> home() {
		return Arrays.asList("Laura", "Bella", "Olga");
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
