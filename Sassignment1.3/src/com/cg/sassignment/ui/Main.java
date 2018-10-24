package com.cg.sassignment.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.SBU;

public class Main {
	public static void main(String args[]){
ApplicationContext app = new ClassPathXmlApplicationContext("Spring.xml");
		
		SBU sbu = (SBU) app.getBean("sbu");
		sbu.printDetails();
	}
}
