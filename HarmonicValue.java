package com.bridgelabz.day5problems;

import java.util.Scanner;

public class HarmonicValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of n: ");
		int n = sc.nextInt();
		double sum = 0.0;
		
		for(int i=0; i<=n; i++) {
			long f = 1;
			
			for(int j=1; j<=i; j++) {
				f*=j;
			}
			  sum+=(1.0/f);
		}
			System.out.println("sum= "+sum);
	}

}
