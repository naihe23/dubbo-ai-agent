package com.dubboai.aitransfer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dubboai.aitransfer.mapper")
public class AiTransferApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiTransferApplication.class, args);
    }

}
