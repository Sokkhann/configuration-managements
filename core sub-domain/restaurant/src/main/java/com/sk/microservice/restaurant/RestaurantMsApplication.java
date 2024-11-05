package com.sk.microservice.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestaurantMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantMsApplication.class, args);
	}

}
