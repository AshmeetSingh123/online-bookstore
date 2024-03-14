package com.books.OnlineBookstore.configs;

import com.books.OnlineBookstore.utils.Constants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getInfo()).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    };

    private ApiInfo getInfo(){
        Contact contact = new Contact("Ashmeet","https://www.linkedin.com/in/ashmeetsinghkalsi/","singh.ashmeet123@gmail.com");
        return new ApiInfo("Online Bookstore","Spring Boot Online Bookstore", Constants.version,"Terms of Service", contact, "License of APIs","API License URL", Collections.emptyList());
    }

}
