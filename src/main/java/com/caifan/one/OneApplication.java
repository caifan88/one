package com.caifan.one;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.caifan.one")
@MapperScan("com.caifan.one.mapper")
public class OneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}
