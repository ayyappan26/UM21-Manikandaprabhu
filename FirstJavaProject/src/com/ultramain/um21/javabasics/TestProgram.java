package com.ultramain.um21.javabasics;
import java.util.Scanner;
public class TestProgram{
	

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num= scan.nextInt();
		int first=0;
		int second=1;
		int third;
		System.out.println(first);
		System.out.println(second);
		for(int i=3;i<=num;i++){
			third= first+second;
			first=second;
			second=third;
			System.out.println(third);	
			}
		}
	 }


