package com.albertoimpl.devoxxbe.containers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ContainersApplication {

	@Value("${provider.url}")
	private String providerUrl;

	@RequestMapping("/hello")
	public String home() {
		List<String> customers = new RestTemplate().getForObject(providerUrl, List.class);
		String message = customers.stream().collect(Collectors.joining(","));
		return "Welcome: " + message;
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
