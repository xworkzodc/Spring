package com.xworkz;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.mysql.jdbc.Driver;

public class DataSourceTester {

	public static void main(String[] args) throws SQLException {

		String contextConfigLocation = "spring/datasource.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(contextConfigLocation);
		System.out.println(container);
		DriverManagerDataSource dm = container.getBean(DriverManagerDataSource.class);

		Connection connection = dm.getConnection();
		System.out.println(connection);

	}

}

//output 
//org.springframework.context.support.ClassPathXmlApplicationContext@179d3b25, started on Mon Feb 15 18:53:54 IST 2021
//Mon Feb 15 18:53:54 IST 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
//com.mysql.jdbc.JDBC4Connection@35047d03