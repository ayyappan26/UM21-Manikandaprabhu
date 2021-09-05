package com.practice.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author R MANI KANDA PRABHU
 * ProblemStatemnt
 * Write a program to display the current system date in the following formats.
 * 1. Tue Nov 04 20:14:11 EST 2003
 * 2. 11/4/03 8:14 PM
 * 3. 8:14:11 PM
 * 4. Nov 4, 2003 8:14:11 PM
 * 5. 8:14 PM
 * 6. 8:14:11 PM
 * 7. 8:14:11 PM EST
 * 8. 11/4/03 8:14 PM
 * 9. Nov 4, 2003 8:14 PM
 * 10. November 4, 2003 8:14:11 PM EST

 *
 */
public class DateFormatPractice {

	public static void main(String[] args) {
		Date myDate =new Date();
		System.out.println("1 "+myDate);
		SimpleDateFormat formater = new SimpleDateFormat("MM/dd/yy HH:MM aa");
		System.out.println("2 "+formater.format(myDate));
		SimpleDateFormat formater2 = new SimpleDateFormat("HH:MM:ss aa");
		System.out.println("3 "+formater2.format(myDate));
		SimpleDateFormat formater3 = new SimpleDateFormat("MMMdd,yyyy,HH:MM:ss aa");
		System.out.println("4 "+formater3.format(myDate));
		SimpleDateFormat formater4 = new SimpleDateFormat("HH:MMaa");
		System.out.println("5 "+formater4.format(myDate));
		System.out.println("6 "+formater2.format(myDate));
		SimpleDateFormat formater6 = new SimpleDateFormat("HH:MM:ssaa z");
		System.out.println("7 "+formater6.format(myDate));
		System.out.println("8 " +formater.format(myDate));
		SimpleDateFormat formater7 = new SimpleDateFormat("MMMdd,yyyy,HH:MM aa");
		System.out.println("9 "+formater7.format(myDate));
		SimpleDateFormat formater8 = new SimpleDateFormat("MMMMMM dd,yyyy,HH:MM:ss aa z");
		System.out.println("10 "+formater8.format(myDate));
		
	}

}
