
public class Employee_5 {
  int empId;
  String empName;
  String empDept;
  double empBasicsalary;
  private double empGrossSalary;
public Employee_5(int empId, String empDept, double empBasicsalary,String empName) {
	this.empId = empId;
	this.empDept = empDept;
	this.empBasicsalary = empBasicsalary;
	this.empName=empName;
}
public double  calculateGrossSalary() {
	double HRA=0.12*empBasicsalary;
	double DA=0.8*this.empBasicsalary;
	this.empGrossSalary=this.empBasicsalary+HRA+DA;
	return empGrossSalary;
}
public  static  void sortEmployees(Employee_5[] emp) {
	for(int i=0;i<emp.length;i++) {
		for(int j=i+1;j<emp.length;j++) {
			if(emp[i].calculateGrossSalary()>emp[j].calculateGrossSalary()) {
				Employee_5 temp=emp[i];
				emp[i]=emp[j];
				emp[j]=temp;
			}
		}
	}
}
public static void SearchEmployees(Employee_5[] emp,String dept) {
	for(Employee_5 val:emp) {
		if(val.empDept.equals(dept)) {
		System.out.println(val.empBasicsalary+","+val.empDept+","+val.empBasicsalary+","+val.empGrossSalary);
	}
	}
	
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(this.empName.equals(((Employee_5)obj).empName)&& this.empId==((Employee_5)obj).empId)
	return true;
	else {
		return false;
	}
}

  
}
