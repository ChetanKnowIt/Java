package TreeExample;

import java.sql.*;
import java.util.*;
public class TreeTest {

	// step 1 load
	// step 2 make connection
	// step 3 statement and get result for query

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Connection con = DriverManager.getConnection(url, "system","system");
			
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from emp");
			
			
			//make treeset and display			
			Set<Emp> emps = new TreeSet<Emp>();
			while(rs.next()) {
				emps.add(new Emp(rs.getInt(1), rs.getString(2), rs.getDouble(6)));				
			}
			for(Emp e:emps) {
				System.out.println(e);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
