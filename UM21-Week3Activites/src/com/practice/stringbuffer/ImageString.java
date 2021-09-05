package com.practice.stringbuffer;

import java.util.Scanner;

public class ImageString {
	public static void main(String args[]){
		System.out.println("Enter any Name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println(name+"|"+getImage(name));
	}
	
	public static String getImage(String name){
		StringBuffer sBuff = new StringBuffer(name);
	    sBuff.reverse();
	    String rName = sBuff.toString();
	    return rName;
	}

}
