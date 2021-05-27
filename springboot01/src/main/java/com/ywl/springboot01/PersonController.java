package com.ywl.springboot01;

import com.ywl.springboot01.bean.Person;
import com.ywl.springboot01.service.PersonService;
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
		return personService.getAllPerson();
	}
}
