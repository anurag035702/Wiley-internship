package com.Fileio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharhierarchy {
	
	public static void Filewriting1(File f){
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			fw.write("this is using filewriter");
			fw.close();
			System.out.println("file is modified");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Filereading1(File f1){
		FileReader fr;
		BufferedReader reader;
		try {
			fr = new FileReader(f1);
			String s=null;
			reader= new BufferedReader(fr);
			
			while((s=reader.readLine())!=null) {
				System.out.println(s);
	     	}
			fr.close();
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	}


