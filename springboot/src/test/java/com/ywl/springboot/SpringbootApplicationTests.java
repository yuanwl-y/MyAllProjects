package com.ywl.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	DataSource dataSource;
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	ApplicationContext ioc;

	@Test
	void test() {
		Object person = ioc.getBean("person");
		System.out.println(person);
	}

	@Test
	void getLog() {
		logger.trace("trace级别日志打印");
		logger.debug("debug级别日志打印");
		logger.info("我是slf4j日志框架的输出日志 info级别");
		logger.warn("warn级别日志打印");
		logger.error("error级别日志打印");
	}

	@Test
	void testGetCon() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

}
