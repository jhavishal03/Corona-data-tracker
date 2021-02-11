package com.example.CoronaTrackier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class  CoronaTrackierApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackierApplication.class, args);
	}

}
