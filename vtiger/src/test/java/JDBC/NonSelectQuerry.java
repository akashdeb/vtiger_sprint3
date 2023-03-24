package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuerry {

	public static void main(String[] args) throws SQLException {
		//1.Register Driver to Java
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//2. Establishing Connection to your database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		//3. Creating a Statement
		Statement statement = connection.createStatement();
		int result = statement.executeUpdate("insert into project values(2, 'Amit', 977676);");
		if(result == 1) {
			System.out.println("The data base has been updated");
		}
		else
			System.out.println("The data base has not been updated");
		
		connection.close();
	}

}
