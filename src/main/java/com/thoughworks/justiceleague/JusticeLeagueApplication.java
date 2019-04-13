package com.thoughworks.justiceleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class JusticeLeagueApplication {

    public static void main(String[] args) {
        SpringApplication.run(JusticeLeagueApplication.class, args);
    }

}
