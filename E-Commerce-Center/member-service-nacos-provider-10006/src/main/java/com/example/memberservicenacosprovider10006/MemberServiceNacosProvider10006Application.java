package com.example.memberservicenacosprovider10006;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MemberServiceNacosProvider10006Application {

    public static void main(String[] args) {
        SpringApplication.run(MemberServiceNacosProvider10006Application.class, args);
    }

}
