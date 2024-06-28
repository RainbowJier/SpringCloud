package com.example.ecommercegateway20000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ECommerceGateway20000Application {

    public static void main(String[] args) {
        SpringApplication.run(ECommerceGateway20000Application.class, args);
    }

}
