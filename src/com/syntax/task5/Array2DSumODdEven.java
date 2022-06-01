package com.syntax.task5;

public class Array2DSumODdEven {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integers. Develop a program 
		 * which will calculate the sum of even and odd 
		 * numbers for that array.
		 */

		int [] [] numbers = {   {1,5,7,9,11}, {200, 100, 99, 50, 4000, 60}, {8,6,4}   };
		
		int oddSum = 0, evenSum = 0;
		//Outer loop iterates over rows
		//Inner loop iterates over columns
		for (int row = 0; row < numbers.length; row ++) {
			for (int col = 0; col < numbers[row].length; col ++) {
				if (numbers[row] [col] % 2 == 0) {
					evenSum += numbers[row] [col];
				} else {
					oddSum += numbers[row] [col];
				}
			}
		}
		System.out.println("Sum of even numbers is " + evenSum);
		System.out.println(("Sum of odd numbers is " + oddSum));
	}
}