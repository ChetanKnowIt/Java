package exp1;

public class InvalidUserException extends Exception {

	String message;

	public InvalidUserException() {
		message = "username is invalid";
	}

	public String getMessage() {
		return message;
	}
	
	public String toString() {
		return message;
	}
}
