package com.example.cloud;

import java.math.BigDecimal;
import java.util.stream.Stream;

import com.example.cloud.entity.User;
import com.example.cloud.repository.UserRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCircuitBreaker
public class MicroserviceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceProviderApplication.class, args);
	}
	@Bean
	ApplicationRunner init(UserRepository repository) {
	  return args -> {
		User user1 = new User(1L, "account1", "张三", 20, new BigDecimal(100.00));
		User user2 = new User(2L, "account2", "李四", 28, new BigDecimal(180.00));
		User user3 = new User(3L, "account3", "王五", 32, new BigDecimal(280.00));
		Stream.of(user1, user2, user3)
		  .forEach(repository::save);
	  };
	}
}
