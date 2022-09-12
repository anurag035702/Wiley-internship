/*
 * Wrapper class-provides mechanism to convert primitive to object and vice versa
 * boolean->Boolean
 * char->Char
 * byte->Byte
 * short->Short
 * int->Integer
 */
public class Wrapper_ex {
	
	public static void check(Integer a) {
		System.out.println(a.getClass().getName());
	}
	public static void main(String args[]) {
   //autoboxing
	Integer t= 5;
	Class C = t.getClass();
	System.out.println(C.getName());
	System.out.println(t+"this is object");
	//boxing depricated
	//Integer i = new Integer(5);
	//unboxing
	int a= t.intValue();
	System.out.println(a+"this is primitive");
	check(t);
	 
	}
}
