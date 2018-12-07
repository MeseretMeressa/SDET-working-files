package com.training.sdet.day1;

public class InhePersonEx {
	public static void main(String[] args) {
		
		//inheMethod1();
		Person p = new Employee();
		p.setPersonId(101);
		p.setPersonName("Kaan");
		
		((Employee)p).setEmployeeSalary(2000);
		((Employee)p).setProjectName("Automation Testing");
		
		System.out.println(p);
		p = new Customer();
		
		System.out.println(p);
		//System.out.println(((Employee)p).getEmployeeSalary());
	}
	
	
	
	public static void inheMethod1(String[] args) {
		Employee emp = new Employee();
		emp.setPersonId(101);
		emp.setPersonName("Mesi");
		emp.setEmployeeSalary(1000);
		emp.setProjectName("Automation Testing");
		
		System.out.println(emp);  //-->internally emp.toString()
		
		Customer customer = new Customer();
		customer.setIncome(223);
		customer.setPersonId(222);
		customer.setPersonName("Kaan");
		
		System.out.println(customer);
		
		
	}

}
