package com.api.parkingcontrol;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Api - Parking Lot")
                        .description("Projeto Original por Micheli Brito")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Linkedin")
                                .url("https://www.linkedin.com/in/tulioalbu/")));
    }
}