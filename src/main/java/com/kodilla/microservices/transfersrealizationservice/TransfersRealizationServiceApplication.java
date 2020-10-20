package com.kodilla.microservices.transfersrealizationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class TransfersRealizationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfersRealizationServiceApplication.class, args);
    }

}
