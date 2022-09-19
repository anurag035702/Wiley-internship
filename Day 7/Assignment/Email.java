import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	String s;

	public Email(String s) {
		this.s = s;
	}
	public void validate() {
		String regex="^[a-z0-9]+@[a-z]+.[a-z]{2,3}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		try {
			if(!(matcher.matches())) {
				throw new EmailException();
			}
			else {
				System.out.println("Email is valid");
			}
		}
		catch(EmailException em) {
			System.err.println(em);
		}
	}
	

}
