package com.training.sdet.day3.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperation {
	public static void main(String[] args) // throws NumberFormatException,
											// IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fileWriter = null;
		
		try {
			System.out.println("Enter emp Id: ");
			int empId = Integer.parseInt(br.readLine());

			System.out.println("Entee Emp name : ");
			String empName = br.readLine();

			System.out.println("Emp Id is " + empId);
			System.out.println("Emp Name is " + empName);
			File file = new File("Sample.txt");
			
			//fileWriter = new FileWriter(file);
			fileWriter = new FileWriter(file, true); //this line is used to append

			fileWriter.write(" Emp Id " + empId +"\n");
			fileWriter.write(" Emp name " + empName + "\n");

			System.out.println("contents written to file");

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
/*

	
	Write a java program to accept a word from the end user, and give the synonym for the same for example, if user enters "helloworld", we should have the Map having the key as string and value are array/list of string. as shown below 

Map<String, String[]> 

do not use iterators to search in map, if the user enters the string which is not the the key in the map, then use should be prompted with the message 

" Word not found, would you like to add", if use says "Yes", then the list of values to be taken and added to map(With .put()) 

*/