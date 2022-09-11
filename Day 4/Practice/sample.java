
public class sample implements interface1,interface2 {

	@Override
	public void printDEscription() {
	 System.out.println("ovverriden printdescription");
		
	}

	@Override
	public void totask() {
		// TODO Auto-generated method stub
		 System.out.println("ovverriden totask");
		
	}
	public static void main(String args[]) {
		sample s= new sample();
		interface1 i=new sample();
		interface2 j= new sample();
		i.printDEscription();
		
	}

}
