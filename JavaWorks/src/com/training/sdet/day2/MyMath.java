package com.training.sdet.day2;
//static variables are available first 
//static blocks are executed first
//static methods are loaded first 
//static blocks can not be invoked they invoked implicitly 
public class MyMath {
	static int x = 0;
	static int add(int num1, int num2){
		return num1 + num2;
	}
	static { 
		System.out.println("x value is " + x);
		System.out.println("This is static block 1");}  //we can have static blocks as many as we want
	static { System.out.println("This is static block 2");} 
    static int sub(int num1, int num2){
		return num1 - num2;
	}
    public static void main(String[] args) {
		//MyMath m = new MyMath(); //cos we added static 
		//System.out.println(m.add(10, 20));
		System.out.println(add(10, 20));
	}
}
