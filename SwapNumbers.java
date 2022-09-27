//Java Program to Swap Two Numbers

package com.bridgelabz.day5problems;

import java.util.Scanner;

public class SwapNumbers {

	static int a,b;
	public static void main(String[] args) {
		int temp;
		System.out.println("Enter First Number: ");
		Scanner x = new Scanner(System.in);
		a=x.nextInt();
		System.out.println("Enter Second Number: ");
		b=x.nextInt();
		System.out.println("Before Swapping Two Numbers: "+a + " "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping Two Numbers: "+a + " "+b);
		

	}

}
