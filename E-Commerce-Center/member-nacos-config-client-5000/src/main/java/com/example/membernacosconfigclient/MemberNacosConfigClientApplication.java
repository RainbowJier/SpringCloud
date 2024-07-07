package com.example.membernacosconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberNacosConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberNacosConfigClientApplication.class, args);
    }

}
