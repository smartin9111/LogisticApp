package com.webuni.spring.smartin.logisticapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.webuni.spring.smartin.logisticapp.service"})
public class LogisticAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LogisticAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
