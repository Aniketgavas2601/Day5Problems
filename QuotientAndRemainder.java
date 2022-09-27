package com.bridgelabz.day5problems;

import java.util.Scanner;

public class QuotientAndRemainder {

	static int dividend,divisor;
	public static void main(String[] args) {
		
		System.out.println("Enter a Dividend Number: ");
		Scanner div = new Scanner(System.in);
		dividend = div.nextInt();
		
		System.out.println("Enter Divisor Number: ");
		divisor = div.nextInt();
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);	

	}

}
