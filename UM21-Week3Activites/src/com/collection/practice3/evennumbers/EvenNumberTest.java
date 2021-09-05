package com.collection.practice3.evennumbers;

/**
 * @author R MANI KANDA PRABHU
 * Problem Statement
 *  1.Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store even numbers from 2 to N, 
 *	where N is a integer which is passed as a parameter to the method storeEvenNumbers().
 *	The method should return the ArrayList (A1) created. 
 *	2.In the same class create a method printEvenNumbers()which iterates through the arrayList A1 in step 1,  
 *	and It should multiply each number with 2 and display it in format 4,8,12….2*N. and add these numbers in a new ArrayList (A2). 
 *	The new ArrayList (A2) created needs to be returned.
 *	3.Create a method retrieveEvenNumber(int N)  parameter is a number N.
 *	This method should search the arrayList (A1) for the existence of the number ‘N’ passed.
 *	If exists it should return the Number else return zero.

 */
public class EvenNumberTest {

	public static void main(String[] args) {
		EvenNumbers myEvenNumbers = new EvenNumbers();
		System.out.println(myEvenNumbers.storeEvenNumber(15));
		System.out.println(myEvenNumbers.printEvenNumber());
		System.out.println(myEvenNumbers.retriveEvenNumber(50));
	}

}
