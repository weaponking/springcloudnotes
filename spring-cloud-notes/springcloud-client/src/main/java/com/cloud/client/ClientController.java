package com.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

@RestController
public class ClientController {

	@Autowired
    private DiscoveryClient client;
	
	@GetMapping("/clisvc")
	public String hello(@RequestParam String words) {
		ServiceInstance instance = client.getInstances("hello-service").get(0);
		return "hello : "+words+" - "+instance.getPort();
	}
}
