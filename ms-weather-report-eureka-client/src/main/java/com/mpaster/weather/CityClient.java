package com.mpaster.weather;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 指定了要访问的服务名称（要路由到的服务或被消费的服务）
 */
@FeignClient("ms-weather-city-eureka")
public interface CityClient {
    @GetMapping("/cities")
    String listCity();
}
