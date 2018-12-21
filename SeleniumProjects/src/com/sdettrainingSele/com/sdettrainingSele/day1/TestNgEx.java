package com.sdettrainingSele.com.sdettrainingSele.day1;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgEx {

	@Test
	  public void f() {
	  }
	
	@BeforeGroups ("Login")
	  public void logIn() {
		  
		  System.out.println("logIn()");
	  }
	@Test (groups = {"Login"}, priority = 0)
	public void LoginTest1(){
		System.out.println("Login Functionality Test1 ");
	}
	@Test (groups = {"Login"}, priority = 1)
	public void LoginTest2(){
		System.out.println("Login Functionality Test2");
	}
	
	@AfterGroups("Login ")
	public void cleanUpLoagin(){
		System.out.println("cleanUpLoagin()");
	}
	
		
	@BeforeGroups ("Search")
	  public void search() {
		  System.out.println("search()");
	  }
	@Test (groups = {"Search"}, priority = 3)
	public void searchTest1(){
		System.out.println("Search Functionality Test1 ");
	}
	@Test (groups = {"Search"}, priority = 4)
	public void searchTest2(){
		System.out.println("Search Functionality Test2");
	}
	
	@AfterGroups("Search ")
	public void cleanUpSearch(){
		System.out.println("cleanUpSearch()");
	}
	
}