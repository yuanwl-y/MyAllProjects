package com.ywl.springboot.controller;


import com.ywl.springboot.bean.Person;
import com.ywl.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
	@Autowired
	private PersonService personService;

	@RequestMapping("/getAllPerson")
	public List<Person> getAllPerson() {
		List<Person> person = personService.getAllPerson();
		return person;
	}


}
