package com.Amdocs.Amy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;	
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmyApplication {
	@GetMapping("/msg")
	
	public String show() {
		return "welcome to jenkis session";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AmyApplication.class, args);
		
		System.out.println("High Amy");
	}

}
