package com.training.sdet.day3.IO;

import java.io.File;

public class FileOperation02 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Huser\\Desktop\\myFolder");
		
		String [] list = file.list();
		
		//for(String temp : list){   //display all the files and folders in the path 
			//System.out.println(temp);
		
		//for(String temp : list){  ///display only the text files
			//File f = new File(file, temp);
			//if(f.isFile()){
				//System.out.println(temp);
			//}
			
		//}
		
		for(String temp : list){  ///display only the text files
			File f = new File(file, temp);
			if(f.isFile() && !f.canWrite()){
				System.out.println(f.getName()); // checking if we have a file and write access// if we don't have write access noting will be returned 
			}}	
	}

}
