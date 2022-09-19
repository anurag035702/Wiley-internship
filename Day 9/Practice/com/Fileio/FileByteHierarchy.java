/*
 * byte stream has FileOutputStream ,FileInputStream
 */
package com.Fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteHierarchy {
	public static void FileWriting(File f) {
		// byte hierarchy
		try(FileOutputStream fos=new FileOutputStream(f,true)) {// used to write into file
			String s="my age is 21";
			byte b[] =s.getBytes();
			fos.write(b);
			System.out.println("file has been modified");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void FileReading(File f) {
		try {
			FileInputStream fis= new FileInputStream(f);
			int i;
			while((i=fis.read())!=-1) {
			System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
	
