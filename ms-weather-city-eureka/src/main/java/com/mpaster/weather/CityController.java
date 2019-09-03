package com.mpaster.weather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

//    @Autowired
//    private CityClient cityClient;

    @GetMapping("/cities")
    public String listCity() {
        String body = new String("哈哈");
        return body;
    }
}
