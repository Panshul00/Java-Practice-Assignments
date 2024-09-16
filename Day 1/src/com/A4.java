package com;

//Exercise 4: Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
import java.util.Scanner;

public class A4 {
	
	public static boolean isPrime(int m) {
		for(int i=2 ; i<=Math.sqrt(m) ;  i++) {
			if(m%i==0)return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		for(int i=2 ; i< number ; i++) {
			if(isPrime(i)) {
				System.out.print(i+"  ");
			}
		}

	}

}
