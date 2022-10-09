package com.assignment.EmployeePayrollService;

public class EmployeePayrollData {
	public int id;
	public String name;
	public double salary;

	//Constructor
	public EmployeePayrollData(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Displays the employee payroll data
	@Override
	public String toString() {
		return "ID -> " + id + ", Name -> " + name + ", Salary -> " + salary;
	}
}
