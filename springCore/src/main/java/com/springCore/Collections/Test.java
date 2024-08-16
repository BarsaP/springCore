package com.springCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/Collections/collectionconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee.getName());
		System.out.println(employee.getPhones());
		System.out.println(employee.getAddresses());
		System.out.println(employee.getCourses());
		System.out.println(employee.getProps());

	}

}
