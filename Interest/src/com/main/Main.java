package com.main;


import java.util.Scanner;

import com.service.Service;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("all")
		Scanner sc=new Scanner(System.in);
		System.out.println( "UserName");
		String uname=sc.next();
		System.out.println("Enter Password");
		String pwd=sc.next();
		Service us=new Service();
		if(us.validateUser(uname, pwd))
			System.out.println("Welcome "+uname+"!");
		else
			System.out.println("lnvalid User data...");
		
		

	}

}
