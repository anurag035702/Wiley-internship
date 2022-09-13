
public class AgeException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "your age is less than 18";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "cannot vote";
	}
    
}
