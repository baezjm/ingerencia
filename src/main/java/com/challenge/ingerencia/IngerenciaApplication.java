package com.challenge.ingerencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IngerenciaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngerenciaApplication.class, args);
    }

}
