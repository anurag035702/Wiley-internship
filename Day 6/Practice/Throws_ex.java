
// business logic should not be written in try catch thus throws is used
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_ex {
   
   public static void main(String args[]) {
	   Throws_ex ex1= new Throws_ex();
	   try {
		ex1.isread();
	} catch (FileNotFoundException e) {
		System.out.println(e);
	}
	   
   }
     public void isread() throws FileNotFoundException {
    	 File obj= new File("notes.txt");
    	 FileInputStream obj1 = new FileInputStream( obj );
     }
}
