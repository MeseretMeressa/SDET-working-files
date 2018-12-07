package com.training.sdet.day2;

public class Ex01 {
	public static void main(String[] args) {
		try {
			try {
				int arr [] = new int [-5];}
			catch (NegativeArraySizeException nase){
				System.out.println(nase);
			}
	int num1 = Integer.parseInt(args [0]);
	int num2 = Integer.parseInt(args [1]);
	
	int res = num1/num2;
	System.out.println( " the result is " + res);
		} catch(ArithmeticException ae){
			System.out.println("Division Prob " + ae);
		}
		catch(NumberFormatException nfe){
			System.out.println(" pls pass only integers" + nfe);
		}
		catch (Exception e){ //this exception block should always be at the end just before finally
			e.printStackTrace();
		} finally {
			System.out.println(" I am from finally");
		}
	System.out.println("Some othe business logic ----");
	
}
}
