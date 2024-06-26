package com.example.memberserviceconsumer80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description：配置RestTemplate负载均衡算法
 * @Author： RainbowJier
 * @Data： 2024/6/23 11:08
 */
@Configuration
public class CustomizationBean {

    @Bean
    @LoadBalanced  // 默认为轮询算法
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
