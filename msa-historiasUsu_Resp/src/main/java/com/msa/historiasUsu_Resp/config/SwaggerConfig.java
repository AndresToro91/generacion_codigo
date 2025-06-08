package com.msa.historiasUsu_Resp.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Gestión de Historias de Usuario")
                        .version("1.0")
                        .description("API REST para la gestión de historias de usuario y responsables")
                        .contact(new Contact()
                                .name("Tu Nombre")
                                .email("tu.email@ejemplo.com")));
    }

}
