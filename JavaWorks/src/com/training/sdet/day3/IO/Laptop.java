package com.training.sdet.day3.IO;

import java.io.Serializable;

public class Laptop implements Serializable{
	private int modelNum;
	private String modelName;
	private String make;
	
	
	public Laptop(int modelNum, String modelName, String make) {
		super();
		this.modelNum = modelNum;
		this.modelName = modelName;
		this.make = make;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Laptop [modelNum=" + modelNum + ", modelName=" + modelName + ", make=" + make + "]";
	}
	

}
