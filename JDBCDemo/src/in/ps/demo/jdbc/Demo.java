package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo {
	public static void main(String []args) {
		try {
			//1st step JDBC - Loading and Registration of Driver
			Class.forName("com.mysql.cj.jdbc.Driver");//fully qualified class name
			System.out.println("Driver loaded and registered successfully");
			
				 //2nd step - Establishing Connection b/w Java & Database
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Shamanth@2003");//sql exception
				 System.out.println("Connection Established");
					
					//3rd step - Creating a platform for execution SQL querry 
					Statement st = con.createStatement();
					System.out.println("Platform created");
					
						//4th step - Executing SQL queries
//						String querry="INSERT INTO STUDENT VALUES (0,'Hitaishi','9807657869','hitaishi@gmail.com','CSE','Banglore','12345',sysdate())";
						String querry="INSERT INTO STUDENT VALUES (0,'Bhavana','8907657865','bhavana@gmail.com','CSE','Mysury','12345',sysdate())";
						int i =st.executeUpdate(querry);
						System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			//Java 7 implementation multiple catch block in single catch block 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
