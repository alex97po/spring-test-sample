package com.pogorelov.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@PropertySource("classpath:myProp.properties")
public class MyConfig {

    @Resource
    private Environment environment;

    @Bean(name = "message")
    public String getMessage() {
        return environment.getProperty("message");
    }
}
