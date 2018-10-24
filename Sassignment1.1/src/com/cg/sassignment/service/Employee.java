package com.cg.sassignment.service;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public void SbuDetails(){
		System.out.println("Employee");
		System.out.println("EmployeeId : "+employeeId);
		System.out.println("EmployeeName : "+employeeName);
		System.out.println("Salary : "+salary);
		System.out.println(businessUnit.getSbuId());
		System.out.println(businessUnit.getSbuName());
		System.out.println(businessUnit.getSbuHead());
	}
}
