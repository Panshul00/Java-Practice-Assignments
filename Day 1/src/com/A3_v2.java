package com;

import java.util.Scanner;

//Exercise 3: The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?

public class A3_v2 {


	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();



	        int i = 0;
	        int fib;

	        while (true) {
	            fib = fibonacci(i);
	            if (fib > m) {
	                break;
	            }
	            System.out.print(fib + " ");
	            i++;
	        }
	    }
	}
