package com;

import java.util.Scanner;

//Create a method to find the sum of the cubes of the digits of an n digit number

public class A1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String number=input.nextLine();
		double sum=0;
		for(int i=0 ; i<number.length(); i++) {
			sum=sum+ Math.pow( Character.getNumericValue(number.charAt(i)),3 );
		}
		System.out.println(sum);

	}

}
