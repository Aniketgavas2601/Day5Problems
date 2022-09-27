package com.bridgelabz.day5problems;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		int min = 1000;
		int max = 9999;
		int random_int;
		System.out.println("Enter a year: ");
		Scanner rnd = new Scanner(System.in);
	    random_int = (int) (Math.random() * (max - min + 1) + min);
		random_int = rnd.nextInt();
		
		if(random_int <= min || random_int >= max)
		{
			System.out.println("Enter 4 Digit Number");
		}
		else
		{
		if(random_int % 4 == 0) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
}
