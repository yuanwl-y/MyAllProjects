package com.ywl.dubbomaster.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private Integer id;
	private String username;
	private String birthday;
	private String sex;
	private String address;
	private Integer did;

}
