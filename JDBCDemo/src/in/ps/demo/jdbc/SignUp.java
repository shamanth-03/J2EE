package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String querry = "INSERT INTO STUDENT VALUES(0,?,?,?,?,?,?,sysdate())";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Shamanth@2003");
			PreparedStatement ps = con.prepareStatement(querry);
			
			System.out.println("Enter your Name: ");
			String name = sc.next();
			System.out.println("Enter your mob number: ");
			long mob = sc.nextLong();
			System.out.println("Enter your EmailId: ");
			String email = sc.next();
			System.out.println("Enter your Branch: ");
			String branch = sc.next();
			System.out.println("Enter your location: ");
			String loc = sc.next();
			System.out.println("Enter your Password: ");
			String pwd = sc.next();
			
			ps.setString(1, name);
			ps.setLong(2, mob);
			ps.setString(3, email);
			ps.setString(4, branch);
			ps.setString(5, loc);
			ps.setString(6, pwd);
			
			int i =ps.executeUpdate();
			if(i>0) {
				System.out.println("SignUp Successful");
			}
			else {
				System.out.println("Signup failed");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
