package com.eis.pl;

import com.eis.bean.Employee;
import com.eis.service.EmployeeService;
import com.eis.service.EmployeeServiceImpl;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();

        Employee employee = service.getEmployeeDetails();

        
        String insuranceScheme = service.findInsuranceScheme(employee);
        System.out.println(insuranceScheme);

        service.displayEmployeeDetails(employee);
    }
}
