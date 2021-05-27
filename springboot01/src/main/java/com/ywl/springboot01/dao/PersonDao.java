package com.ywl.springboot01.dao;

import com.ywl.springboot01.bean.Person;
import com.ywl.springboot01.mapper.PersonMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDao extends SqlSessionDaoSupport implements PersonMapper {
	@Override
	public List<Person> getAllPerson() {
		return this.getAllPerson();
	}
}
