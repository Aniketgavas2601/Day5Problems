//Java Program to Find the Largest Among Three Numbers
package com.bridgelabz.day5problems;

import java.util.Scanner;

public class LargestNumber {
	
	static int a,b,c;
	
	public static void main(String[] args) {
		
		System.out.println("Enter first Number: ");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		
		System.out.println("Enter Third Number: ");
		c = sc.nextInt();
		
		//check the conditions for greater Numbers
		
		if(a > b && a > c)
		{
			System.out.println("greater Number is: "+a);
		}
		else if(b > a && b > c)
		{
			System.out.println("greater Number is: "+b);
		}
		else
		{
			System.out.println("greater Number is: "+c);
		}
	}
}

