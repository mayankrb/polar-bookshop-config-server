package com.mayank.ecommerce.polarbookshopconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PolarBookshopConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolarBookshopConfigServerApplication.class, args);
    }

}
