package com.example.memberservicenacosprovider10004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // 启动 Nacos 注册
public class MemberServiceNacosProvider10004Application {
    public static void main(String[] args) {
        SpringApplication.run(MemberServiceNacosProvider10004Application.class, args);
    }

}
