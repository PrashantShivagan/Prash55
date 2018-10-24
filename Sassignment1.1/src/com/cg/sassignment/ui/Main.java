package com.cg.sassignment.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.sassignment.service.Employee;
import com.cg.sassignment.service.SBU;

public class Main {
	public static void main(String args[]){
		
		ApplicationContext app = new ClassPathXmlApplicationContext("Spring.xml");
		
		Employee emp = (Employee) app.getBean("emp");
		SBU bu=(SBU) app.getBean("bu");
		emp.setEmployeeId(1001);
		emp.setEmployeeName("Prashant");
		emp.setSalary(400000.00);
		emp.setBusinessUnit(bu);
		bu.setSbuId(1002);
		bu.setSbuName("Suresh");
		bu.setSbuHead("suresh");
		emp.SbuDetails();
	}
}
