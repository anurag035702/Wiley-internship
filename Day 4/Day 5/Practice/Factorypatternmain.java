
public class Factorypatternmain {
 public static void main(String args[]) {
	 vehicle v=vehicleFactory.getInstance("car",6);
	 System.out.println(v.toString());
 }
}
