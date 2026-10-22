package model2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	static String url="jdbc:mysql://localhost:3306/employee_db";
	static String user="root";
	static String password="root";
	public static Connection dbconnection() throws ClassNotFoundException {
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,user,password);
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		if(conn!=null) {
			System.out.println("Database is connected");
		}
		else {
            System.out.println("Database is not connected");
		}
		return conn;
	}
	
	public static void main(String args[]) throws ClassNotFoundException {
		
		System.out.println(DBconnection.dbconnection());
	}

}
