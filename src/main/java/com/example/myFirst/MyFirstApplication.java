package com.example.myFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstApplication {

	public static void main(String[] args) {
		System.out.println("Application Running...");

		System.out.println(MyController.Mymethod());
		SpringApplication.run(MyFirstApplication.class, args);
	}

}
