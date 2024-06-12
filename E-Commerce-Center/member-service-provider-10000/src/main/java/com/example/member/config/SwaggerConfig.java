package com.example.member.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/6/11 20:32
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("SpringCloud")
                        .description("Document")
                        .version("v1")
                        .contact(new Contact()
                                .name("RainbowJier")
                                .email("3021809270@qq.com")
                                .url("https://example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("External Documents外部文档")
                        .url("https://springshop.wiki.github.org/docs"));
    }
}