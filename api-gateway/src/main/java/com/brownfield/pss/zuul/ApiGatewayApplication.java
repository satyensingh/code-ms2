package com.brownfield.pss.zuul;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin
@EnableSwagger2
public class ApiGatewayApplication {
	
//	@Bean
//	public CustomZuulFilter customFilter() {
//		return new CustomZuulFilter();
//	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}

@RestController 
class APIGatewayController {

	@RequestMapping("/")
	String greet(HttpServletRequest req){
		return "<H1>API Gateway Powered By Zuul</H1>"; 
	}
}