package com.zdww.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XanderEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(XanderEurekaApplication.class, args);
    }

}