package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Autowired
    private AutowiredDependency autowiredDependency;

    @Bean
    public BeanToTest beanToTest() {
        return new BeanToTest(autowiredDependency);
    }
}


