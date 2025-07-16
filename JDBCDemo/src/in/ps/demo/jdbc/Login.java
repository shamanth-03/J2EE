package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String querry ="SELECT * FROM STUDENT WHERE MAIL=? AND PASSWORD = ? ";
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Shamanth@2003");
			PreparedStatement ps = con.prepareStatement(querry);
			
			System.out.println("Enter your EmailId");
			String email = sc.next();
			System.out.println("Enter your password");
			String pwd = sc.next();
			ps.setString(1,email);
			ps.setString(2,pwd);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("Login Successful");
				System.out.println("Welcome: "+rs.getString("name"));
			}
			else {
				System.out.println("Login failed");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

