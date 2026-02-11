package com.example.PincodeDistanceBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PincodeDistanceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PincodeDistanceBackendApplication.class, args);
	}

}
