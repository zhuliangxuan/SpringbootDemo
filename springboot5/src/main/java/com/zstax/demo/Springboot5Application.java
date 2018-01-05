package com.zstax.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.zstax.demo.dao")
public class Springboot5Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot5Application.class, args);
    }
}
