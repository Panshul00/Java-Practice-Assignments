package com.eis.service;

import java.util.Scanner;
import com.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee ID: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Employee Name: ");
		String name = scanner.nextLine();

		System.out.println("Enter Employee Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter Employee Designation: ");
		String designation = scanner.nextLine();

		
		return new Employee(id, name, salary, designation);
	}

	@Override
	public String findInsuranceScheme(Employee employee) {
		return employee.getInsuranceScheme();
	}

	@Override
	public void displayEmployeeDetails(Employee employee) {
		System.out.println(employee);
	}
}
