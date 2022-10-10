//input 10 ---> Factors are 1 2 5 10

import java.util.Scanner;

public class FactorNum {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter Any Number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0) {
			System.out.print(i + " ");
		}
		}
		
	}

}
