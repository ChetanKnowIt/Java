package exp1;

import java.util.*;

public class DemoException {

	public static void registerUser(String un, String pwd) throws InvalidUserException {
		boolean flag = true;
		if (un.length() != 5) {
			flag = false;
		} else {
			for (int i = 0; i < un.length(); i++) {
				if (un.charAt(i) >= 65 && un.charAt(i) <= 90 || un.charAt(i) >= 97 && un.charAt(i) <= 122) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		if (flag == false) {
			throw new InvalidUserException();
		}
	}

	public static void main(String[] args) {

		String username, password;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your username and password: ");
		username = sc.next();
		password = sc.next();

		try {
			registerUser(username, password);
		} catch (InvalidUserException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
