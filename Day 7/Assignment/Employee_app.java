
public class Employee_app {
public static void main(String[] ar) {
	Address temp= new Address(402,"lalithambika","AS raju road","Hyderabad");
	Address perm= new Address(202,"Mirra","AS raju road","Hyderabad");
	Address []empaddress= new Address [] {temp,perm};
	Employee e1= new Employee(100,"anurag",empaddress);
	System.out.println(e1);
}
}
