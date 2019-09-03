package com.mpaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaWeatherReportEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaWeatherReportEurekaApplication.class, args);
	}

}
