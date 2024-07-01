package com.example.memberservicenacosconsumer80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberServiceNacosConsumer80Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceNacosConsumer80Application.class, args);
    }

}
