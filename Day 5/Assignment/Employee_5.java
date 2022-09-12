
public class Employee_5 {
  int empId;
  String empDept;
  double empBasicsalary;
  private double empGrossSalary;
public Employee_5(int empId, String empDept, double empBasicsalary) {
	this.empId = empId;
	this.empDept = empDept;
	this.empBasicsalary = empBasicsalary;
}
public void calculateGrossSalary() {
	double HRA=0.12*empBasicsalary;
	double DA=0.8*this.empBasicsalary;
	this.empGrossSalary=this.empBasicsalary+HRA+DA;
	System.out.println(empGrossSalary);
}
public  static  void sortEmployees(Employee_5[] emp) {
	for(int i=0;i<emp.length;i++) {
		for(int j=i+1;j<emp.length;j++) {
			if(emp[i].empBasicsalary>emp[j].empBasicsalary) {
				Employee_5 temp=emp[i];
				emp[i]=emp[j];
				emp[j]=temp;
			}
		}
	}
}
public static void SearchEmployees(Employee_5[] emp) {
	for(Employee_5 val:emp) {
		System.out.println(val.empBasicsalary+","+val.empDept+","+val.empBasicsalary);
	}
	
}

  
}
