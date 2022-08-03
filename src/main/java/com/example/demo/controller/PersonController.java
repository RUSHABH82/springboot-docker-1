package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.sevice.PersonService;

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

	@Autowired private PersonService personService;
	
	@GetMapping("greet")
	public String getGreeting() {
		return "hello";
	}
	
	@GetMapping("list")
	public List<Person> getPersonList() {
		return personService.getAllPersonList();
	}
	
	@PostMapping("save")
	public Person savePerson(Person person) {
		return personService.savePerson(person);
	}
	
}
