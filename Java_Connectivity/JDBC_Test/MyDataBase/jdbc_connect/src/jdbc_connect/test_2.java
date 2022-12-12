/*
 * Accept deptno from user and display all employee from that dept
 *  
 * */
package jdbc_connect;

// Step-1 Import SQL classes

import java.sql.*;
import java.util.*;

public class test_2 {

	public static void main(String[] args) {
		try {
			// Step-2 Load Driver: give fully qualified path of driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// Step-3 Establish Connection: give proper URL
			String url, username, password;
			url = "jdbc:oracle:thin:@localhost:1521:XE";
			username = "system";
			password = "system";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("====== Connection Successful! ==========");
			
			
			//Accept deptno from user
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter deptno");
		    int deptno = sc.nextInt();// Read user input
		    
		    String query = "select * from emp where deptno ="+deptno;
		    
			// Step-4 Create SQL Query: make statements
			Statement smt = con.createStatement();
			
			// Step-5 Execute: execute depending on statement
			ResultSet rs = smt.executeQuery(query);
			
			System.out.println("All employee data: ");
			if(rs.next())
			{
				do {
					System.out.println(
							   " "+ rs.getString(1) 
							+ " " + rs.getString(2) 
							+ " " + rs.getString(3)
							+ " " + rs.getString(4)
							+ " " + rs.getString(5)
							+ " " + rs.getString(6)
							+ " " + rs.getString(7)
							+ " " + rs.getString(8)
				);
				}while(rs.next());
			}
			
			
		}catch (ClassNotFoundException | SQLException e)
		{
			System.out.print(e);
		}
	}
}
