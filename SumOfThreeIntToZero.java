package com.bridgelabz.day5problems;

public class SumOfThreeIntToZero {
	public static void main(String[] args) {

		int[] arr = { 3, -1, -7, -4, -5, 9, 10 };

		// first for loop for take a Number

		for (int i = 0; i < arr.length; i++) {
			int firstNum = arr[i];

		//Second for loop for take a next  Number
			for (int j = i + 1; j < arr.length; j++) {
				int secondNum = arr[j];

		//third loop for take a next Number		
				for (int k = j + 1; k < arr.length; k++) {
					int thirdNum = arr[k];

					int sum = firstNum + secondNum + thirdNum;
					if (sum == 0) {
						System.out.print(firstNum + "," + secondNum + "," + thirdNum);
						System.out.println("");
						System.out.println("These triplets gives sum is zero: " + sum);
					}
				}

			}
		}
	}
}
