package com.example.memberserviceconsumer80.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description：配置RestTemplate
 * @Author： RainbowJier
 * @Data： 2024/6/23 11:08
 */
@Configuration
public class CustomizationBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
