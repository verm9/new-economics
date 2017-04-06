package com.verm9.ne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewEconomicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewEconomicsApplication.class, args);
	}
}
