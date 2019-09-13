package com.pancarte.gotham;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan

@SpringBootConfiguration

public class GothamApplication {

	public static void main(String[] args) {
		SpringApplication.run(GothamApplication.class, args);
	}

}
