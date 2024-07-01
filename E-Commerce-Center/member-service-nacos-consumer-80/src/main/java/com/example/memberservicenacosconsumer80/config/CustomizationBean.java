package com.example.memberservicenacosconsumer80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomizationBean {

    @Bean
    @LoadBalanced  // 默认为轮询算法
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
