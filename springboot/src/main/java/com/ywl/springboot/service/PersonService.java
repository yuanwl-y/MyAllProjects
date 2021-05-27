package com.ywl.springboot.service;

import com.ywl.springboot.bean.Person;
import com.ywl.springboot.dao.PersonMapperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
	@Autowired
	private PersonMapperDao personMapperDao;

	public List<Person> getAllPerson() {
		return personMapperDao.getAllPerson();
	}
}
