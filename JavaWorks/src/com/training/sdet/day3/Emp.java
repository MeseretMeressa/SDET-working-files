package com.training.sdet.day3;

public class Emp implements Comparable<Emp>   {
	private int empId;
	private String empName;
	private double empSal;
	
		
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		
		return this.empName.charAt(0);
	}
	
	@Override  // this equal method give true or false to check there are dups 
		public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		
		Emp emp = (Emp) obj;
		/*
		if (
				this.empId == emp.empId &&
				this.empName.equals(emp.getEmpName()) &&
				this.empSal == emp.empSal
				) {
			
			return true;
		} else {
			
			return false;
		}
		*/  //instead  
		
		return
		this.empId == emp.empId &&
				this.empName.equals(emp.getEmpName()) &&
				this.empSal == emp.empSal;
	}
	
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		//return 0;
		return this.getEmpId() - o.getEmpId();
	}

	
	
}
