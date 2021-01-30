package com.works.wings.reousrce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebFlux
public class Oauth2ResourceServer {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceServer.class, args);
    }

}
