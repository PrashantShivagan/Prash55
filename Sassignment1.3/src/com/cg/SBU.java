package com.cg;

import java.util.List;

import com.cg.Employee;


public class SBU {
	
	 int sbuCode;
	 String sbuName;
	 String sbuHead;
	 List<Employee> empList;
	
	
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
	public void printDetails(){
			System.out.println("sbuCode : "+sbuCode+ " sbuName : "+sbuName+ " sbuHead : "+sbuHead);
			System.out.println("-----------------------------------------------------------------");
			for(Employee ee : empList){
				System.out.println("EmployeeId :  "+ee.employeeid+ " EmployeeName : "+ee.employeeName+ " Salary : "+ee.salary);
			}
		}
}
