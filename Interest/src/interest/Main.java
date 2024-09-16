package interest;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("Select the option:");
	            System.out.println("1. Interest Calculator –SB");
	            System.out.println("2. Interest Calculator –FD");
	            System.out.println("3. Interest Calculator –RD");
	            System.out.println("4. Exit");

	            int choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the Average amount in your account:");
	                    double sbAmount = sc.nextDouble();
	                    System.out.println("Enter account type (Normal/NRI):");
	                    String accountType = sc.next();
	                    SBAccount sbAccount = new SBAccount(sbAmount, accountType);
	                    System.out.println("Interest gained: Rs. " + sbAccount.calculateInterest());
	                    break;

	                case 2:
	                    System.out.println("Enter the FD amount:");
	                    double fdAmount = sc.nextDouble();
	                    System.out.println("Enter the number of days:");
	                    int noOfDays = sc.nextInt();
	                    System.out.println("Enter your age:");
	                    int age = sc.nextInt();
	                    FDAccount fdAccount = new FDAccount(fdAmount, noOfDays, age);
	                    System.out.println("Interest gained is: Rs. " + fdAccount.calculateInterest());
	                    break;

	                case 3:
	                    System.out.println("Enter the RD monthly amount:");
	                    double monthlyAmount = sc.nextDouble();
	                    System.out.println("Enter the number of months:");
	                    int noOfMonths = sc.nextInt();
	                    System.out.println("Enter your age:");
	                    int rdAge = sc.nextInt();
	                    RDAccount rdAccount = new RDAccount(noOfMonths, monthlyAmount, rdAge);
	                    System.out.println("Interest gained is: Rs. " + rdAccount.calculateInterest());
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid option! Please choose again.");
	            }
	        }

	 }}
