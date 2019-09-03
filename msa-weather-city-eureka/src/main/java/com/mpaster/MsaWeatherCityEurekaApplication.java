package com.mpaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherCityEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherCityEurekaApplication.class, args);
	}

}
