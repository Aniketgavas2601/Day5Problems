//Java Program to Check Whether an Alphabet is Vowel or Consonant
package com.bridgelabz.day5problems;

import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter an Alphabet: ");
		Scanner obj1 = new Scanner(System.in); 
		ch = obj1.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'o' || ch == 'U')
		{
			System.out.println("Alphabet is Vowel.");
	}
		else
		{
			System.out.println("Alphabet is Consonant.");
		}

}
}
