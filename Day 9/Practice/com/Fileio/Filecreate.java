package com.Fileio;

import java.io.File;
import java.io.IOException;

public class Filecreate {
	public static void main(String[] args) {
		File f= new File("new.txt");
		try {
			if(!f.exists())
			f.createNewFile();
			else
				System.out.println("already exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
