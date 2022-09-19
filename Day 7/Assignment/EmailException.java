
public class EmailException extends Exception{

	@Override
	public String getMessage() {
		return "Your email is invalid";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Email Exception";
	}

}
