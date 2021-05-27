package com.ywl.springboot01.service;

import com.ywl.springboot01.bean.Person;
import com.ywl.springboot01.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
	@Autowired
	private PersonDao personDao;

	public List<Person> getAllPerson() {
		return personDao.getAllPerson();
	}
}
