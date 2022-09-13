/*
 * Exception -interupts the flow of program
 * 2 types of exceptions
 * 1)Checked exception-checked at compile time ,this occurs when jvm doesn't have the resources available
 * 2)Unchecked Exception-they occur at runtime 
 *             object
 *               |
 *           throwable
 *           /    \
 *         Errors  Exception
 *                  /     \
 *            unchecked  checked
 */              
public class Exception_1 {
	int val1;
	int val2;
	int val3=0;
	public Exception_1(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	public void divide() {
		//val3=val1/val2; throws error 
	try {
		val3=val1/val2;
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
//	catch(ArithmeticException ae) { error because it is already handled by Exception class which is super class
//		
//	}
	finally {
		System.out.println("this is finally block");
	}
	}
}
class test{
	public static void main(String args[]) {
		Exception_1 e1=new Exception_1(10,0);
		e1.divide();
	}
}
