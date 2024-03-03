package io.jetbrains.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value("${my.greetings: default value}")
	String greetMsg;
	
	@GetMapping("/greeting")
	public String myGreeting() {
		
		return "my greeting "+ greetMsg;
	}

}
