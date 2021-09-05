package com.practice.numbers.increasing;

public class NumberCheck {

	public static void main(String[] args) {
		
		System.out.println(checkNumber(789));
	

	}
	
	public static boolean checkNumber(int n) {
		String str=Integer.toString(n)
;
		boolean flag=true;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				flag=false;
				break;
			}
		}
		return flag;
		
	}
}
