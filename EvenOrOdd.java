//Java Program to Check Whether a Number is Even or Odd
package com.bridgelabz.day5problems;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int a;
	
		System.out.println("Enter a Number: ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		
		//check the Number is even or odd
		
		if(a % 2 == 0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
	}

}
}