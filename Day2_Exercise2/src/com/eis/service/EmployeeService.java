package com.eis.service;

import com.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    String findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}
