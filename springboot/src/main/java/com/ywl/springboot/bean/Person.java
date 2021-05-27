package com.ywl.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
	private Integer id;
	private Integer username;
	private Integer birthday;
	private Integer sex;
	private Integer address;
	private Integer d_id;

}
