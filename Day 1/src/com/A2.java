package com;

import java.util.Scanner;

//Exercise 2: Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow, or green with radio buttons. On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.


public class A2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String choice=input.nextLine();
		
        switch (choice) {
        case "red":
            System.out.println("Stop");
            break;
            
        case "yellow":
            System.out.println("Ready");
            break;
            
        case "green":
            System.out.println("Go");
            break;
            
        default:
            System.out.println("Invalid input.");
            break;
    }
		

	}

}
