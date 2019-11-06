package com.albertoimpl.devoxxbe.containers;

import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.Probe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@KubernetesApplication(
		group = "albertoimpl", // until https://github.com/dekorateio/dekorate/issues/250
		livenessProbe = @Probe(httpActionPath = "/actuator/info"),
		readinessProbe = @Probe(httpActionPath = "/actuator/health")
)
public class ContainersApplication {

	@RestController
	static class HelloController {

		@RequestMapping("/")
		public String home() {
			return "Hello, All";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainersApplication.class, args);
	}

}
