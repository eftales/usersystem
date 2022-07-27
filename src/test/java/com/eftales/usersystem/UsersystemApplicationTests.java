package com.eftales.usersystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class UsersystemApplicationTests {
	@Autowired
	DataSource datasource;
	@Test
	void contextLoads() throws SQLException {
		System.out.println(datasource.getClass());
		Connection connection = datasource.getConnection();
		System.out.println(connection);

		connection.close();

	}

}
