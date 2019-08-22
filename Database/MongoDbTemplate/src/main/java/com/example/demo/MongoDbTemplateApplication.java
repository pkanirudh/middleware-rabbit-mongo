package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Car;
import com.example.demo.repo.MyRepository;
import com.example.demo.repo.MyRepositoryImpl;

@SpringBootApplication
public class MongoDbTemplateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MongoDbTemplateApplication.class, args);
	
		MyRepository<Car> repo = ctx.getBean(MyRepository.class);
		
		Car car = ctx.getBean(Car.class);
		Car saved = repo.save(car);
		
		System.out.println("One car saved with details " + saved);
	}

}
