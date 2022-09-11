//has-a kind of relationship one class has object of other
//refer this link for composition and aggregation -https://www.geeksforgeeks.org/association-composition-aggregation-java/
public class Student {
 int rollno;
 String name;
 Date_has_a dateofAdmission;// object of date class
public Student(int rollno, String name, Date_has_a dateofAdmission) {
	this.rollno = rollno;
	this.name = name;
	this.dateofAdmission = dateofAdmission;
}
// reference var of date class.method
public void displayStudent() {
	System.out.println(this.rollno+" "+this.name+" "+ dateofAdmission.displayDate());
}

public static void main(String []args) {
	Date_has_a d1= new Date_has_a(32,9,2022);
	if(d1.checkdate()==true) {
	Student st= new Student(101,"anurag",d1);
	st.displayStudent();
	}
	else {
		System.out.println("Not a valid date");
	}
}
}
