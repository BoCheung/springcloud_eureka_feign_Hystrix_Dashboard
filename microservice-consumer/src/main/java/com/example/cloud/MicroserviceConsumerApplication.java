package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MicroserviceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerApplication.class, args);
	}

}
