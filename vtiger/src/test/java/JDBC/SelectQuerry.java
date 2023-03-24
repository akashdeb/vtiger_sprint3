package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuerry {

	public static void main(String[] args) throws SQLException {
		//1.Register Driver to Java
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//2. Establishing Connection to your database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		//3. Creating a Statement
		Statement statement = connection.createStatement();
		//4. Writing the Query
		ResultSet result = statement.executeQuery("select * from project;");
		while(result.next()) {
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
		}
		//closing the database
		connection.close();
	}

}
