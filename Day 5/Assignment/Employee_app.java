
public class Employee_app {
	public static void main(String args[]) {
		Employee_5 e1=new Employee_5(101,"A",10000,"a1");
		Employee_5 e2=new Employee_5(101,"A",20000,"a1");
		Employee_5 e3=new Employee_5(103,"A",30000,"a3");
		Employee_5 e4=new Employee_5(104,"D",40000,"a4");
		Employee_5 e5=new Employee_5(105,"E",50000,"a5");
		
		Employee_5[] emp =new Employee_5[]{e1,e2,e3,e4,e5};
		Employee_5.sortEmployees(emp);
		Employee_5.SearchEmployees(emp,"A");
		System.out.println(	e1.equals(e2));
	
		
	
	}

}
