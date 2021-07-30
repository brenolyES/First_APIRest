package com.times.fisrtapirest.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;




@Configuration
public class SwaggerConfig {
    @Bean
   public Docket productApi() {

       return new Docket(DocumentationType.SWAGGER_2)
              .useDefaultResponseMessages(false)
              .select()          
              .apis(RequestHandlerSelectors.basePackage("com.times.fisrtapirest"))
              .paths(PathSelectors.regex(("/api.*")))
              .build()
              .apiInfo(metaInfo());
  }

  private ApiInfo metaInfo() {
    return new ApiInfoBuilder()
        .title("Times - API Rest")
        .description("\"API Rest desenvolvida apenas para estudos e testes.\"")
        .version("1.0.0")
        .license("Brenoly Porto - Link do meu Github")
        .licenseUrl("https://github.com/brenolyES")
        .build();
}



}

