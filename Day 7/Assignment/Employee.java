

public class Employee {
int empid;
String empName;
Address []empaddress;
public Employee(int empid, String empName, Address[] empaddress) {
	this.empid = empid;
	this.empName = empName;
	this.empaddress = empaddress;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empName=" + empName + ", Tempaddress=" + empaddress[0].toString() +", Permaddress="+ empaddress[1].toString() +"]";
}
}
