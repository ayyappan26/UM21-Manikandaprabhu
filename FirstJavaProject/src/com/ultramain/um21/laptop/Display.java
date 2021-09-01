package com.ultramain.um21.laptop;

public class Display {
	public void displayLaptopDetails(Laptop laptop){
		  System.out.println("Model:" +laptop.getModel());
		  System.out.println("CompanyName:"+laptop.getCompanyName());
		  System.out.println("ProcessorType:"+ laptop.getProcessorType());
		  System.out.println("Ram Size:"+laptop.getRamSize());
		  System.out.println("Purchase Year"+laptop.getPurchaseYear());
	}

}
