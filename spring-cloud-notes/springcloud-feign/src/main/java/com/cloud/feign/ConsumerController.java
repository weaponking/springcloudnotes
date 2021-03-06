package com.cloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
    @Autowired
    private HelloServiceClient helloServiceClient;
    @GetMapping("/clisvc")
    public String hello(String words) {
        return helloServiceClient.hello(words);
    }
}
