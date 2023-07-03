package com.thinkconstructive.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

}
