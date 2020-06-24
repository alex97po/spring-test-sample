package com.pogorelov.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pogorelov.springtest")
public class SpringGoitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGoitApplication.class, args);
    }
}
