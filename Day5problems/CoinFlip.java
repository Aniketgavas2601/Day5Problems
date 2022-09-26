package com.bridgelabz.day5problems;

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		
		  System.out.println("enter the no. of times to flip the coin: ");
	        int count=0, count1=0,count2=0;
	        Scanner flip=new Scanner(System.in); //Creating Object for Scanner class.
	        int num=flip.nextInt();
	        //checking for the no. of flips greater than zero or not
	        if(num>0)
	        {
	            while(count<=num)
	            {
	                //probability for head or tail.
	                if(Math.random()<0.5)
	                {
	                    count2+=1;
	                }
	                else
	                {
	                    count1+=1;
	                }
	                count+=1;
	            }
	            double tails=((double)count2/num)*100;
	            double heads=((double)count1/num)*100;
	            //Percentage for head and tail.
	            System.out.println("Heads flip percentage= "+heads+"%");
	            System.out.println("Tails flip percentage= "+tails+"%");
	        }
	        else
	        {
	            System.out.println("invalid data entered");
	        }
	    }

	}


