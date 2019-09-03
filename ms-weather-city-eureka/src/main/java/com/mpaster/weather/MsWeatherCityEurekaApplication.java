package com.mpaster.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsWeatherCityEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWeatherCityEurekaApplication.class, args);
    }

}
