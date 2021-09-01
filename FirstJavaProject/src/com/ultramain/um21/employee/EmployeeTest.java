package com.ultramain.um21.employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeDTO employee[]= new EmployeeDTO[EmployeeTest.getUserInput()];
		for(int i=0; i<= employee.length; i++){
			System.out.println("Enter the number of employess");
		}

	}
    public static int getUserInput(){
    	System.out.println("Enter The number of employess");
    	Scanner scan = new Scanner(System.in);
    	int userInput= scan.nextInt();
    	return userInput;
    }
    public static void dummyMethod(){
    	
    }
}
