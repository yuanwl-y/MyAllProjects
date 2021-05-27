package com.ywl.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ywl.springboot.bean.Person;
import com.ywl.springboot.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class PersonController {
	@Autowired
	private PersonMapper personMapper;

	@RequestMapping("/getAllPerson")
	@Cacheable(cacheNames = "person01")
	public List<Person> getAllPerson() throws JsonProcessingException {
		List<Person> allPerson = personMapper.getAllPerson();
		//2.创建jackson的核心对象  ObjectMApper
		ObjectMapper mapper = new ObjectMapper();
		//转换制图器
		String value = mapper.writeValueAsString(allPerson);
		System.out.println("数据库查 不是缓存");
		System.out.println(value);
		System.out.println(allPerson);
		return personMapper.getAllPerson();
	}

	@RequestMapping("/getPerson")
	@Cacheable(cacheNames = "person02")
	public List<Map<String, Object>> getPerson() {
		System.out.println("数据库查，不是缓存");
		return personMapper.getPerson();

	}
}
