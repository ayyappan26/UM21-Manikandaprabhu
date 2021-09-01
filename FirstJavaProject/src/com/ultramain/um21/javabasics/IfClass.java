package com.ultramain.um21.javabasics;

import java.util.Scanner;

public class IfClass {

	public static void main(String[] args){

		 String bookType;
		 System.out.println("Enter the Book Type");
		 Scanner scan= new Scanner(System.in);
		 bookType= scan.next();
		 if(bookType=="Fiction"){
			 System.out.println("Book Issued successfully, please return the book within 7 days");
		 }
		 else{
			 System.out.println("Oops you are allowed to take only adult fiction books");
		 }
	 }	
		

}


