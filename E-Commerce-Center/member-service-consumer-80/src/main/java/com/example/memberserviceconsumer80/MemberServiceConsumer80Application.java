package com.example.memberserviceconsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// Set the module as eureka client.
@EnableEurekaClient
// Open Discovery
@EnableDiscoveryClient
public class MemberServiceConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceConsumer80Application.class, args);
    }

}
