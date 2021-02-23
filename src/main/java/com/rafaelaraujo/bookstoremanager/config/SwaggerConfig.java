package com.rafaelaraujo.bookstoremanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String NAME = "Rafael Araújo";
    private static final String DESCRIPTION = "Bookstore Manager Api professional";
    private static final String TITLE = "Bookstore Manager Course";
    private static final String URL = "JEDI.RAFAEL@GMAIL.COM";
    private static final String EMAIL = "JEDI.RAFAEL@GMAIL.COM";
    private static final String BASE_PACKAGE = "com.rafaelaraujo.bookstoremanager";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESCRIPTION)
                .contact(new Contact(NAME, URL, EMAIL)).build();
    }

}
