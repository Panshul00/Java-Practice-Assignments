package com;

import java.util.Scanner;

//Exercise 6: Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
public class A6 {

	public static double calculateDifference(int number) {
		double a=0,b=0;
		for(int i=1 ; i<= number ; i++) {
			a+=i;
			b+=Math.pow(i, 2);
			
		}
	double sum=b-Math.pow(a, 2);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();

		System.out.println(calculateDifference(number));

	}

}
