package com.ultramain.um21.laptop;

import java.util.Scanner;

import com.ultramain.um21.laptop.Laptop;

public class LaptopTest{
	private static Scanner scan;

	public static void main(String args[]){
		scan = new Scanner(System.in);
		Laptop myLaptop = new Laptop();
		System.out.println("Enter the laptop Model:");
		String laptopModel = scan.nextLine();
		myLaptop.setModel(laptopModel);
		System.out.println("Enter the laptop company name:");
		String laptopCompanyName = scan.nextLine();
		myLaptop.setCompanyName(laptopCompanyName);
		System.out.println("Enter the laptop Processor Type");
		String laptopProcessorType = scan.nextLine();
		myLaptop.setProcessorType(laptopProcessorType);
		System.out.println("Enter the laptop RAM Size:");
		String ramSize = scan.nextLine();
		myLaptop.setRamSize(ramSize);
		System.out.println("Enter the laptop Purchase Year:");
		int laptopPurchaseYear = scan.nextInt();
		myLaptop.setPurchaseYear(laptopPurchaseYear);
		
		Display lapDisplay = new Display();
		lapDisplay.displayLaptopDetails(myLaptop);
		
	}
}