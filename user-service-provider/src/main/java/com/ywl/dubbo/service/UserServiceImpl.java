package com.ywl.dubbo.service;

import com.ywl.dubbomaster.bean.Person;
import com.ywl.dubbomaster.service.userService;

import java.util.Arrays;

public class UserServiceImpl implements userService {
	@Override
	public List<Person> getAllUsers(String  userId) {
		Person p1=new Person(1,"小明","2021-5-11","男","杭州西湖",30);
		Person p2=new Person(2,"二狗","1990-5-11","女","北京",30);
		return Arrays.asList(p1,p2);
	}
}
