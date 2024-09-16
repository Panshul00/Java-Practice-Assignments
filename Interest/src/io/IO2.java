package io;

import java.io.File;

public class IO2 {

	public static void main(String[] args) {
		
		 File file = new File("C:\\study\\sd.txt");

	        if (file.exists()) {
	            System.out.println("File exists: Yes");
	            System.out.println("File is readable: " + file.canRead());
	            System.out.println("File is writable: " + file.canWrite());
	            System.out.println("File is a directory: " + file.isDirectory());
	            System.out.println("File is a regular file: " + file.isFile());
	            System.out.println("File size: " + file.length() + " bytes");
	        } else {
	            System.out.println("File does not exist.");
	        }

	}

}
