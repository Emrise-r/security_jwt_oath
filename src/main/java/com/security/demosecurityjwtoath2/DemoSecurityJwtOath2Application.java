package com.security.demosecurityjwtoath2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class DemoSecurityJwtOath2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSecurityJwtOath2Application.class, args);
    }

}
