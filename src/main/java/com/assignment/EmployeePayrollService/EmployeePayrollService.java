package com.assignment.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    private final List<EmployeePayrollData> employeePayrollList;	
    
    //Constructor
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        employeePayrollService.readEmployeePayrollData(scanner);
        employeePayrollService.writeEmployeePayrollData();
    }

    //This method will Read the user input through console. 
    public void readEmployeePayrollData(Scanner scanner) {
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String name = scanner.next();
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    //This method will Write the data to console. 
    private void writeEmployeePayrollData() {
		System.out.println("\n: Employee Payroll :\n" + employeePayrollList);
	}
}