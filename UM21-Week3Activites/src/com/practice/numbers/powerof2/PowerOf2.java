package com.practice.numbers.powerof2;

import java.util.Scanner;

/**
 * @author R MANI KANDA PRABHU
 * Get the number and Check ifnit is power of 2 or not
 */
public class PowerOf2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		if(checkNumber(scan.nextInt())){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
    public static boolean checkNumber(int n){
    	
    	if(n==0){
    		return false;
    	}
    	while(n!=1){
    		if(n%2!=0){
    			return false;
    		}
    		n= n/2;
    	}
    	return true;
    }
}
