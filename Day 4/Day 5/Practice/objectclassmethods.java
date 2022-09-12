//Cloneable is marker interface
//A marker interface is an interface that has no methods or constants inside it. It provides run-time type information about objects, so the compiler and JVM have additional information(persmission) about the object.
public class objectclassmethods implements Cloneable {
 int empid;
 String empname;
public objectclassmethods(int empid, String empname) {
	this.empid = empid;
	this.empname = empname;
}

 @Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	 if(this.empid==((objectclassmethods)obj).empid) {
		 return true;
	 }
	return false;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.empid+" "+this.empname;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return this.empid*10;
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

public static void main(String []args) throws CloneNotSupportedException {
	 objectclassmethods  e1=new objectclassmethods(101,"a");
	 objectclassmethods  e2=new objectclassmethods(102,"a");
//	 if(e1==e2) checks for memory location or object they are pointing to
//		 System.out.println("equal");
//	 else
//		 System.out.println(" not equal");
	 
	 if(e1.equals(e2)) {
		 System.out.println("equal");
	 }
	 else {
		 System.out.println("not equal");
	 }
	 System.out.println(e1.toString());
	 System.out.println(e1.hashCode());
	 System.out.println(e2.hashCode());
	 
	 objectclassmethods  e3= (objectclassmethods )e2.clone();
	 System.out.println(e3.toString());
 }
}
