/*
 * file is not related to jvm thus it throws 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checked_1 {
	public static void main(String args[]) {
		File obj= new File("notes.txt");
		try {
			FileInputStream obj1 = new FileInputStream( obj );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			 System.out.println(e);
		}
		
			}

}
