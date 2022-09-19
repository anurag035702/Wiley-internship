/*steps- serialization
 * storing the object state in the file permanently
 * create a class that implements serializable
 * create object of that class
 * open any file in write mode using fileoutputstream
 * passs the file output stream to object output stream 
 * invoke the writeobject() of objectoutput stream and pass the object
 * 
 */
package com.Fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialise_1 implements Serializable{
	
	public static void serialize(Student_ser s1) {
		try {
			FileOutputStream fos= new FileOutputStream("studentinfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeInt(s1.dateofadm.getDd());// to get the date and get is serialized
			System.out.println("object is serialized");
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void deserialize() {
		try {
			FileInputStream fis= new FileInputStream("studentinfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student_ser s2=(Student_ser)ois.readObject();
			int i=ois.readInt();
			Date d= new Date(i,0,0);
			s2.setDt(d);
			System.out.println(s2.Name+" "+s2.rno+" "+s2.sec+" "+s2.dateofadm);
			ois.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Student_ser s1= new Student_ser (03,"anurag","A",new Date(10,9,2021));
		serialise_1.serialize(s1);
		serialise_1.deserialize();
	}
	

}
