package com.drhui.rabbit.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.drhui.rabbit.user.mapper")
public class RabbitUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitUserApplication.class, args);
    }

}
