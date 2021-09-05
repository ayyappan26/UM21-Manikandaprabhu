package com.string.practice.assignment2;

public class Solution2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("This is StringBuffer");
		String str=sb.toString();
		System.out.println(str);
		System.out.println("--------------------------------------");
		sb.append("- This is a sample program");
		System.out.println(" 1. "+sb.toString());
		sb.insert(21, "Object");
		System.out.println(" 2. "+sb.toString());
		System.out.println(" 3. "+sb.reverse());
		String str1= str.replace("Buffer", "Builder");
		System.out.println(" 4. "+str1);
	}

}
