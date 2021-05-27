package com.ywl.dubbo.service;
import com.ywl.dubbomaster.service.userService;
import com.ywl.dubbomaster.service.orderService;

public class orderServiceImpl implements orderService {
	userService userService;
	@Override
	public void initOrder(String userId) {
		List<Person> person = userService.getAllUsers("1");
		System.out.println(person);

	}
}
