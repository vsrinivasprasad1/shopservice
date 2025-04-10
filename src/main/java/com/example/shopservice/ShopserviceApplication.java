package com.example.shopservice;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopserviceApplication.class, args);
	}

	@Bean
	ToolCallbackProvider toolCallbackProvider(Shopper shopper){
		return MethodToolCallbackProvider.builder().toolObjects(shopper).build();
	}
}
