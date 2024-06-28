package com.example.memberopenfeignconsumer80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description：OpenFeign日志配置
 * @Author： RainbowJier
 * @Data： 2024/6/26 19:42
 */

@Configuration
public class OpenFeignLogConfig {

    @Bean
    Logger.Level loggerLevel() {
        //日志级别指定为FULL
        return Logger.Level.FULL;
    }
}
