package com.works.wings.wingssecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WingsSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(WingsSecurityApplication.class, args);
    }

}
