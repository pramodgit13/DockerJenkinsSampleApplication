package com.example.DockerJenkinsSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerJenkinsSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsSampleApplication.class, args);
	}
	@RestController
	public class Welcome {

		@GetMapping ("/")
		public String HomePage() {
			Test t = new Test();
			return "Hard work!"+ t;
		}
	}
}
