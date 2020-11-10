package com.example.demomq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class DemomqApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomqApplication.class, args);
    }

}
