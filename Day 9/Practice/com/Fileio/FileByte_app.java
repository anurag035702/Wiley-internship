package com.Fileio;

import java.io.File;

public class FileByte_app {
	public static void main(String[] args) {
		File f= new File("FileCreate.txt");
		FileByteHierarchy.FileWriting(f);
		FileByteHierarchy.FileReading(f);
		
		
	
	}
}
