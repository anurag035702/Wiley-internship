/*
 * this class contains :base and height
 * height is triple of base
 * calculate the area of triangle
 * using getter setter we can use private members in another class
 * getXxx,setXxx
 * empId:getEmpId,setEmpId
 */
public class Triangle {
	private double base,height,area;// this is tight encapsulation
 public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}



 public Triangle(double base) {
	 this.base=base;
	 this.height=this.base*3;
 }
 
 public double calarea() {
	 area=0.5*base*height;
	 return area;
 }
 

}
