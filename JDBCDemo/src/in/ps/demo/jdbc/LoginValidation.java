package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/students", "root", "Shamanth@2003");
			Statement st  =con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the email:");
			String mail = sc.next();
			System.out.println("Enter the password:");
			String password = sc.next();
			String query = "SELECT * FROM STUDENT WHERE MAIL ='"+mail+"' AND PASSWORD ='"+password+"'";
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next()) {
				String checkMail = rs.getString("mail");
				String checkPass = rs.getString("password");
				if(checkMail.equals(mail) && checkPass.equals(password)) {
					System.out.println("Login Successfull.");
					System.out.println("Welcome "+rs.getString("name"));
				}
				else {
					System.out.println("Invalid login credentials ");
				}
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
