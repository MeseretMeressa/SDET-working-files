package com.training.sdet.day3.IO;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args)throws IOException  {
		File file = new File("Simple.txt");
		if (file.exists()){
			//System.out.println("File exists and deleting");
			System.out.println("File exists");
			System.out.println("modified time " + file.lastModified());
			System.out.println("can read " + file.canRead());
			System.out.println("can write " + file.canWrite());
			System.out.println("absolute path " + file.getAbsolutePath());
			
			System.out.println("Path Seperator " + File.pathSeparator);
			
			//file.delete();
			
		}else {
			file.createNewFile();
			System.out.println("Filecreated");
		}
		System.out.println("Job Done");
	}
}
