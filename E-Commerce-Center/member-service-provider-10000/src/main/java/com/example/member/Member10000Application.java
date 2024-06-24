package com.example.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// Set the module as eureka client.
@EnableEurekaClient
public class Member10000Application {

    public static void main(String[] args) {
        SpringApplication.run(Member10000Application.class, args);
    }

}
