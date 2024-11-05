package com.sk.microservice.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMsApplication.class, args);
	}

}
