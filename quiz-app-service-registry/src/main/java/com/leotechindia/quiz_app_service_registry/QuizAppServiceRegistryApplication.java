package com.leotechindia.quiz_app_service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class QuizAppServiceRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuizAppServiceRegistryApplication.class, args);
    }
}