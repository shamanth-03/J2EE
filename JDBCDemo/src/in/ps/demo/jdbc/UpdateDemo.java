package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/students", "root", "Shamanth@2003");
			System.out.println("Connection established");
			
			Statement st = con.createStatement();
			System.out.println("Platform created");
			
//			String query = "UPDATE STUDENT SET PHONE ='9554875212' WHERE ID = 2";
			String query ="UPDATE STUDENT SET PASSWORD = '123' WHERE ID = 1";
			int i = st.executeUpdate(query);
			System.out.println(i);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

