package com.example.memberserviceprovider10002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
// Open Discovery
@EnableDiscoveryClient
public class MemberServiceProvider10002Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceProvider10002Application.class, args);
    }

}
