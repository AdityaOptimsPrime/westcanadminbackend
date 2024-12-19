package com.example.westcanbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.example.westcanbackend.controller","com.example.westcanbackend.service.Implementation"})
public class WestcanbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WestcanbackendApplication.class, args);
	}

}
