package com.albertoimpl.devoxxbe.containers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@Value("${app.name}")
	private String applicationName;

	@RequestMapping("/")
	public String home() {
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
