package jdbc_connect;
import java.sql.*;
import java.util.*;

/*
 * 
 * Insert one record in emp table with prepared statement
 * 
 * */
public class test_3 {

	private static java.sql.Date getCurrentDate() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Date(today.getTime());
	}
	
	
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
			  
		    PreparedStatement psmt = con.prepareStatement(""
		    		+ " insert into emp110 "
		    		+ " VALUES (?,?,?,?,?,?,?,?)");
		    		 
		    psmt.setInt(1, 1245);
		    psmt.setString(2, "Geeta");
		    psmt.setString(3, "Doctor");
		    psmt.setInt(4,  7839);
		    psmt.setDate(5, getCurrentDate());
		    psmt.setString(6, "9500.90");
		    psmt.setString(7, "1410");
		    psmt.setInt(8, 10);
			psmt.executeUpdate();
			
		    String query = "select * from emp110";
			Statement smt = con.createStatement();
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
