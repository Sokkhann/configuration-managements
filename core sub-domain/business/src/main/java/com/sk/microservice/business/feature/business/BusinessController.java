package com.sk.microservice.business.feature.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/businesses")
public class BusinessController {

    @GetMapping
    Map<String, String> findAll() {
        return Map.of("Name", "Cake");
    }
}
