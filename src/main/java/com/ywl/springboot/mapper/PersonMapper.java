package com.ywl.springboot.mapper;

import com.ywl.springboot.bean.Person;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

//@Mapper
public interface PersonMapper {
	@Select("select * from gspw_log")
	List<Person> getLog();

	@Select("select * from person")
	List<Person> getAllPerson();

	@Select("select * from gspw_archives")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	List<Map<String, Object>> getPerson();
}
