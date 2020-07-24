package kits.learnvocab.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import home.facebooks.config.ConnectionFactory;

public class ConnectionFactory {
	private String driverDb = "org.mariadb.jdbc.Driver";
	private String connectionUrl = "jdbc:mariadb://localhost://:3306/spring-boot-hibernate";
	private String dbUser = "root";
	private String dbPass ="123";
	
private static ConnectionFactory instance = null;
	
	private ConnectionFactory() {
		try {
			Class.forName(driverDb);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static ConnectionFactory getInstance() {
		if (instance == null) {
			instance = new ConnectionFactory();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPass);
		return conn;
	}
}

	
}
