package com.gateway.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@SpringBootApplication
@ComponentScan("com.gateway.apigateway")
public class ApigatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

}
