package com.origami.unicorn.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    /**
     * 读取 application.properties 中 swagger-ui.enabled 属性是否开启
     */
    @Value("${springfox.documentation.swagger-ui.enabled}")
    Boolean swaggerEnabled;

    @Bean
    Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .enable(swaggerEnabled)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.origami.unicorn.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact(
                "史旭冉",
                "https://github.com/JaredAKAEren",
                "erenakajared@gmail.com");

        return new ApiInfo(
                "Project - Unicorn",
                "Project - Unicorn 接口文档",
                "1.0.0",
                "https://github.com/JaredAKAEren",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
