package com.capgemini.in;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
@RestController
public class CustomAutoConfig {
	@GetMapping("/autoconfig")
	String saHello() {
		return "Hey there you are using Autoconfig";
		
	}

}
