package com.ywl.springboot.controller;

import com.ywl.springboot.bean.User;
import com.ywl.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	UserDao userDao;

	@RequestMapping("/getUser")
	@Cacheable(cacheNames = "user")
	public List<User> getUser() {
		System.out.println("没缓存");
		return userDao.findAll();
	}


	@RequestMapping("/addUser")
	public User addUser(User user) {
		return userDao.save(user);

	}


}
