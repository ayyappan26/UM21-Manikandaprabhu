package com.interfcae.assignment2;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		KidUser myKidUser = new KidUser();
		System.out.println("Enter your age");
		int age = scan.nextInt();
		myKidUser.registerAccount(age);
		if (age <= 12) {
			System.out.println("Enter the book type");
			String bookType = scan.next();
			myKidUser.requestBook(bookType);
		}
		
        System.out.println("--------------------------------------");
		AdultUser myAdultUser = new AdultUser();
		System.out.println("Enter Your Age: ");
		age = scan.nextInt();
		myAdultUser.registerAccount(age);
		if (age > 12) {
			System.out.println("Enter the book type ");
			String bookType = scan.next();
			myAdultUser.requestBook(bookType);
		}
	}
}

interface LibraryUser {
	public void registerAccount(int userAge);

	public void requestBook(String bType);

}

class KidUser implements LibraryUser {
	private int age;
	private String bookType;

	public void registerAccount(int userAge) {
		this.age = userAge;
		if (age <= 12) {
			System.out.println("You have succesfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a Kid");
		}
	}

	public void requestBook(String bType) {
		this.bookType = bType;
		if (bookType.equals("Kids")) {
			System.out.println("Book Issued succesfully, Please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only Kids Books");
		}
	}

}

class AdultUser implements LibraryUser {
	private int age;
	private String bookType;

	public void registerAccount(int userAge) {
		this.age = userAge;
		if (age > 12) {
			System.out.println("You have succesfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}

	public void requestBook(String bType) {
		this.bookType = bType;
		if (bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops you are allowed to take only adult fiction books");
		}
	}
}