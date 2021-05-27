package com.ywl.dubbomaster.service;


import com.ywl.dubbomaster.bean.Person;

import java.util.List;

public interface userService {
	List<Person> getAllUsers(String userId);
}
