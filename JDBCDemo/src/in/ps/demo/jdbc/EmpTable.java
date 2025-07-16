package in.ps.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/company_1","root","Shamanth@2003");
			Statement st = con.createStatement();
			
			String query = "SELECT * FROM EMP";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt("eid");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				
				System.out.println(id+"  "+fname+" "+lname+"  "+job+"  "+sal);
				
			}
			
			
			
//			email and passsword validation;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
