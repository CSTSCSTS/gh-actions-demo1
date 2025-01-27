package com.example.ghactionsdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GhActionsDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(GhActionsDemo1Application.class, args);
	}

	@RestController
	public static class HelloWorldController {
		@GetMapping("/")
		public String helloWorld() {
			return "Hello world!!!!!!!";
		}
	}

}
