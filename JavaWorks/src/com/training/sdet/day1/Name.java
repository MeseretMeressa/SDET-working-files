package com.training.sdet.day1;

public class Name {
	private String firstName;
	private String lasName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	/*public String toString(){
		return this.firstName + "," + this.lasName;
}*/
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lasName=" + lasName + "]";
	}
	
}
