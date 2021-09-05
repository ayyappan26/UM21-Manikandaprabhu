package com.practice.string.nextcharacter;

import java.util.Scanner;

/**
 * @author R MANI KANDA PRABHU
 * Create a method that accepts a String and replaces all consonants in the String with next alphabet
 *
 */
public class StringConsonats {
	private static final String CONSONANTS="bcdfghjklmnpqrstvwxyz";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Word");
		String input = scan.next();
		System.out.println(replaceConsonants(input));

	}
	public static String replaceConsonants(String input) {
	    char[] chars = input.toLowerCase().toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        int idx = CONSONANTS.indexOf(chars[i]);
	        if (idx != -1)
	            chars[i] = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
	    }
	    return new String(chars);
	}

}
