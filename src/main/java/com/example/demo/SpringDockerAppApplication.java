package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@SpringBootApplication
public class SpringDockerAppApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerAppApplication.class, args);
	}

	//@Bean
	CommandLineRunner run(PersonRepository personRepository) {
		return args -> {
			personRepository.save(new Person(null, "rushabh", "rush@123"));
			personRepository.save(new Person(null, "darshit", "dar@123"));
			personRepository.save(new Person(null, "bava", "bava@123"));

		};
	}
}
