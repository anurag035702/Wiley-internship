/*
 * throw , throws the exception 
 * 
 */
public class Exception_2 {
  public  void check() {
	  try {
		  System.out.println("i am in try block");
		  throw new ArithmeticException();
	  }
	  catch(ArithmeticException ae) {
		  System.out.println("i am in catch block");
		  System.out.println(ae);
	  }
	  finally {
		  System.out.println("i am in finally block");
	  }
  }
  public static void main(String args[]) {
	  Exception_2 e2= new  Exception_2 ();
	  e2.check();
  }
}
