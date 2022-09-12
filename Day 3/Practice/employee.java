/*this keyword is used to refer to current object
 *this keyword is used to identify the instant variables
 *this can be used to invoke the constructor
 *this() should be the first statement of the constructor
 * there should be no cyclic references to this()
 * 
 */
public class employee {
   int empno;
   String empname;
   
   public employee(){
	   //this(101,"xyz");
	   System.out.println("default constructor");
   }
   
   public employee(int empno,String empname) {
	   this();
	   this.empno=empno;
	   this.empname=empname;
	   System.out.println("parametrized constructor");
   }
}
 class test{
	 public static void main(String []args) {
		 employee e=new employee(101,"xyz");
	 }
 }