package com.mpaster.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsWeatherEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsWeatherEurekaServerApplication.class, args);
    }

}
