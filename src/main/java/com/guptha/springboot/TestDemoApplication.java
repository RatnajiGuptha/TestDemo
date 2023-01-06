package com.guptha.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("Server is running on port number 8080");
	
	}

}
