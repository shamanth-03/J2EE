package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/students","root","Shamanth@2003");
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM STUDENT";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {	//boolean          getx();
				int id = rs.getInt("id");
				String name = rs.getString("name");
				long phone = rs.getLong("phone");
				String branch = rs.getString("branch");
				
				System.out.println(id+" "+name+" "+phone+" "+branch);
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
