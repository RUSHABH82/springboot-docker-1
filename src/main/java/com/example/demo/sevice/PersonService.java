package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public List<Person> getAllPersonList() {
		return personRepository.findAll();
	}
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

}
