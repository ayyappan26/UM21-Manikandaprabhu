package com.collection.practice3.evennumbers;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
	List<Integer> A1 = new ArrayList<>();
	List<Integer> A2 = new ArrayList<>();

	/**
	 * Stores the N even numbers in List A1
	 * @param N
	 * @return A1 of type List
	 */
	public List<Integer> storeEvenNumber(int N) {
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				A1.add(i);
			}
		}
		return A1;

	}

	/**
	 * Multiplies every element in A1 by 2 and Stores it in A2
	 * @return A2 of type Set
	 */
	public List<Integer> printEvenNumber() {
		for (int i = 0; i < A1.size(); i++) {
			A2.add(A1.get(i) * 2);
		}
		return A2;

	}

	/**
	 * Iterates through A1 and look for the N
	 * @param N
	 * @return if found return N else return 0
	 */
	public int retriveEvenNumber(int N) {
		for (int i = 0; i < A1.size(); i++) {
			if (A1.get(i) == N) {
				return N;
			}

		}
		return 0;

	}

}
