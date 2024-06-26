package com.example.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication()
// Set the module as eureka client.
@EnableEurekaClient
// Open Discovery
@EnableDiscoveryClient
public class MemberServiceProvider10000Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceProvider10000Application.class, args);
    }

}
