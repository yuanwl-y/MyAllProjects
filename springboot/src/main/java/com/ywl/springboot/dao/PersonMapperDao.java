package com.ywl.springboot.dao;

import com.ywl.springboot.bean.Person;
import com.ywl.springboot.mapper.PersonMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonMapperDao extends SqlSessionDaoSupport implements PersonMapper {
	@Override
	public List<Person> getAllPerson() {
		return this.getSqlSession().getMapper(PersonMapper.class).getAllPerson();
	}
}
