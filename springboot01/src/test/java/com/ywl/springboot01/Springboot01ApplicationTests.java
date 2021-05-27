package com.ywl.springboot01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot01ApplicationTests {
	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		System.out.println(connection);
	}

}
