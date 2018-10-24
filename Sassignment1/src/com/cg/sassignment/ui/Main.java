package com.cg.sassignment.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.saaaignment.service.Employee;


public class Main {
	public static void main(String args[]){
		
		ApplicationContext app = new ClassPathXmlApplicationContext("Spring.xml");
		
		Employee emp = (Employee) app.getBean("emp");
		//emp.setEmployeeId(1001);
		//emp.setEmployeeName("Prashant");
		//emp.setSalary(400000.00);
		//emp.setBusinessUnit("JFD");
		//emp.setAge(22);
		
		emp.getDetails();
	}
}
