package com.training.sdet.day3.IO;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new java.io.FileReader("Sample.txt"));
			String line = "";
			while ((line = br.readLine()) !=null){
				System.out.println(line);
			}
						
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
