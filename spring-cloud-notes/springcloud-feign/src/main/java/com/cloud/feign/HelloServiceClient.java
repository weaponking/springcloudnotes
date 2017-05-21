package com.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("HELLO-SERVICE")
public interface HelloServiceClient {
	@GetMapping("/clisvc")
	String hello(@RequestParam(value="words") String words);
}
