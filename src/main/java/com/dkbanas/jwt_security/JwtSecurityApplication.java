package com.dkbanas.jwt_security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class JwtSecurityApplication {

	private static final Logger logger = LoggerFactory.getLogger(JwtSecurityApplication.class);
	public static void main(String[] args) {
		logger.info("Starting JwtSecurityApplication...");
		SpringApplication.run(JwtSecurityApplication.class, args);
	}

}
