package com.example.chat102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Chat102Application {

    public static void main(String[] args) {
        SpringApplication.run(Chat102Application.class, args);
    }

}
