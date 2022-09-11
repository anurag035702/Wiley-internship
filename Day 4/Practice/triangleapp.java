
public class triangleapp {
	 public static void main(String args[]) {
		 Triangle tri= new Triangle(10);
		// tri.height=800;this statement should not be possible because height should be decided based on base but user is able to provide ht
		System.out.println("base of triangle "+tri.getBase());
		System.out.println("height of triangle "+tri.getHeight());
		 double area=tri.calarea();
		 System.out.println("Area:"+area);
		 }
}
