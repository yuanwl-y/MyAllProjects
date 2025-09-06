package com.ywl.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("档案管理系统 API")
                        .version("1.0")
                        .description("档案管理系统的 RESTful API 文档")
                        .contact(new Contact()
                                .name("技术支持")
                                .email("support@example.com")))
                .addServersItem(new Server()
                        .url("http://localhost:8080")
                        .description("本地开发服务器"));
    }
}
