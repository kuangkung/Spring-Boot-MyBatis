package com.kuangkung;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.kuangkung.dao"})
public class SpringbootDbApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDbApplication.class, args);
    }

}
