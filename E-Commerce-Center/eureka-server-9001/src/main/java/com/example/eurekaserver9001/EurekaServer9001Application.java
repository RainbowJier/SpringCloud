package com.example.eurekaserver9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// As a eureka server to run.
@EnableEurekaServer
public class EurekaServer9001Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9001Application.class, args);
    }

}
