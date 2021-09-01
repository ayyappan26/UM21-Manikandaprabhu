package com.ultramain.um21.laptop;

public class Laptop{

	private String model;
	private String companyName;
	private String processorType;
	private String ramSize;
	private int purchaseYear;
	
	public Laptop(){
		
	}
	
	public Laptop(String model, String companyName, String processorType, String ramSize, int purchaseYear ){
		this.model=model;
		this.companyName=companyName;
		this.processorType=processorType;
		this.ramSize=ramSize;
		this.purchaseYear=purchaseYear;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	public int getPurchaseYear() {
		return purchaseYear;
	}
	public void setPurchaseYear(int purchaseYear) {
		this.purchaseYear = purchaseYear;
	}
	
	
	
}
	
	
	
	
	
	

	