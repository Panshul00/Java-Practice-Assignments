package com;

import java.util.Scanner;

//Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
public class A5 {

	public static int calculateSum(int number) {
		int sum=0;
		for(int i=1 ; i<= number ; i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();

		System.out.println(calculateSum(number));

	}

}
