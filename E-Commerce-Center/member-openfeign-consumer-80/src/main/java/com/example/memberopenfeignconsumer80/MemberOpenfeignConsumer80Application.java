package com.example.memberopenfeignconsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient // Set the module as eureka client.
@EnableDiscoveryClient // Open Discovery
@EnableFeignClients   // Enable OpenFeign
public class MemberOpenfeignConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberOpenfeignConsumer80Application.class, args);
    }

}
