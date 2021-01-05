package com.du.devsecops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevsecopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsecopsApplication.class, args);
		System.out.println("Test");
	}

}
