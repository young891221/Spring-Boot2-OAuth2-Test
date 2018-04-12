package com.example.boot2oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Boot2OauthApplication {

    /**
     * http://localhost:8080/oauth2/authorization/google
     */
    public static void main(String[] args) {
        SpringApplication.run(Boot2OauthApplication.class, args);
    }
}
