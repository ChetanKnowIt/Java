package student_rdbms;

import java.sql.*;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		Connection con = null;
		Statement smt = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			con = DriverManager.getConnection(url, "system", "system");
			smt = con.createStatement();

			int ch = 0;
			do {
				System.out.println("1. Insert Record\n" + "2. Display All Records\n" + "3. Update name\n"
						+ "4. Delete\n" + "0. Exit\n" + "Enter your Choice ");
				Scanner sc = new Scanner(System.in);
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					int rno;
					String name;
					double avg;
					System.out.println(" Enter Student: Rno Name");
					rno = sc.nextInt();
					name = sc.next();

					psmt = con.prepareStatement("insert into student values (?,?)");
					psmt.setInt(1, rno);
					psmt.setString(2, name);
					int no = psmt.executeUpdate();
					System.out.println(no + " Records Inserted ");
					break;
				case 2:
					ResultSet rs = smt.executeQuery("select * from student");
					if (rs.next()) {
						do {
							System.out.println(rs.getInt(1) + " " + rs.getString(2));
						} while (rs.next());
					}
					break;
				case 3:
					String nm;
					int rn;
					System.out.println("Enter roll number to update: ");
					rn = sc.nextInt();
					System.out.println("Enter new name for: " + rn);
					nm = sc.next();

					psmt = con.prepareStatement("update student set name=? where rno=?");
					psmt.setString(1, nm);
					psmt.setInt(2, rn);
					int n3 = psmt.executeUpdate();
					System.out.println(n3 + " Records Updated. ");
					break;
				case 4:
					ResultSet rs4 = smt.executeQuery("select * from student");
					if (rs4.next()) {
						do {
							System.out.println(rs4.getInt(1) + " " + rs4.getString(2));
						} while (rs4.next());
					}

					int n4;
					
					System.out.println("Enter roll number to delete from table: ");
					n4 = sc.nextInt();
					psmt = con.prepareStatement("delete from student where rno=?");
					psmt.setInt(1, n4);
					int e = psmt.executeUpdate();
					System.out.println(e + " Records Deleted. ");

					break;

				}
			} while (ch != 0);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}

}
