package com.practice.difference.squares;

/**
 * @author R MANI KANDA PRABHU Find the Sum of Squares of N numbers and the
 *         Square of sum of N numbers And find diffrence between Sum of Squares
 *         of N numbers and the Square of sum of N numbers
 *
 */
public class DiffrenceBetweenSquares {

	public static void main(String argd[]) {
		System.out.println(calculateDiffrence(70));

	}

	public static int calculateDiffrence(int n) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int diff = 0;
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			int squa = i * i;
			sumOfSquares = sumOfSquares + squa;
			sum = sum + i;
		}
		squareOfSum = sum * sum;
		System.out.println("Sum of the squares of numbers starting from 1 to " + n + " is " + sumOfSquares);
		System.out.println("Square of Sum of numbers starting from 1 to " + n + " is " + squareOfSum);
		diff = sumOfSquares - squareOfSum;
		return diff;
	}

}
