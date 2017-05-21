package com.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;
    
    @GetMapping("/clisvc")
    public String hello(String words) {
        return restTemplate.getForEntity("http://HELLO-SERVICE/clisvc?wordsa="+words, String.class).getBody();
    }
    
}
