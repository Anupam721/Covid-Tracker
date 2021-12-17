package com.anupam.covtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovTrackerApplication.class, args);
	}

}
