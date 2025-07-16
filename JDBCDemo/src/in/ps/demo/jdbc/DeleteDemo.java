package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "Shamanth@2003");
			System.out.println("Connection established");
			
			Statement st = con.createStatement();
			System.out.println("Platform created");
			
			String query = "DELETE FROM STUDENT WHERE ID = 3";
			int i = st.executeUpdate(query);
			System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
