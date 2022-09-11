/*
 * static variable
 * static method 
 * static block
 * static class - this can only be possible for inner class 
 * */
public class Employee {
 int empid;
 String empname;
 static int count;//class variable shared across all objects
 //int count=0;instance variable for each object initial value is 0
public Employee(int empid, String empname) {
	this.empid = empid;
	this.empname = empname;
	count++;
}
//static block
// static block is executed even before main() if both are in same class
static {
	System.out.println("static block is executed");
	count=20;
}
// static method is used to process static members
// should be invoked with class name
//static method is not dedicated to the object , so you cannot use keyword of object, and you cannot use any instance variable inside static method
public static int getCount() {
	//empid=90; error
	return count;
}
}
class test{
	public static void main(String args[]) {
		System.out.println("i am in main block");
		Employee e1 = new Employee(101,"a");
		Employee e2 = new Employee(102,"b");
		Employee e3 = new Employee(103,"c");
		System.out.println("number of employee:"+Employee.getCount());
	}}
