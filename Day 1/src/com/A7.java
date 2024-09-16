
//Exercise 7: Create a method to check if a number is an increasing number
package com;

import java.util.Scanner;

public class A7 {

	public static boolean checkNumber(int number) {
		int prev=11;
		while(number>0) {
			if(number%10 > prev) {
				return false;
			}
			prev=number%10;
			number=number/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();

		System.out.println(checkNumber(number));

	}

}
