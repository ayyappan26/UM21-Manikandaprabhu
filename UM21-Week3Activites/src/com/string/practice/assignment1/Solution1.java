package com.string.practice.assignment1;

public class Solution1 {

	public static void main(String[] args) {
		String str="Welcome to Java World";
		System.out.println(str);
		System.out.println("--------------------------");
		System.out.println("1. "+str.charAt(4));
		if(str.contains("Welcome")) {
			System.out.println("2. "+true);
		}else {
			System.out.println("2. "+false);
		}
		String str1=str.concat("- Let us learn");
		System.out.println("3. "+str1);
		System.out.println("4. "+str.indexOf("a"));
		System.out.println("5. "+str.replace("a","e"));
		System.out.println("6. "+str.substring(3, 10));
		System.out.println("7. "+str.toLowerCase());

	}

}
