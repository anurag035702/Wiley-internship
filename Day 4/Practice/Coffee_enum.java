/*
 * Enum-group of static objects contained within a class
 */
public class Coffee_enum {
  public static void main(String args[]) {
	  coffee cf= coffee.Capachino;
	  System.out.println(cf);
	  cf.prepare();
	  System.out.println("cost:"+cf.calCost());
	  // values() - used to iterate over the loop
	 for(coffee c:coffee.values()) {
		 System.out.println(c);
	 }
	 // valueOf() method returns enum constant along with name
	 coffee a=coffee.valueOf("Capachino");
	 System.out.println(a);
  }
}
