package com.springCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifecycle/lyfecycleconfig.xml");
        
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		//registering shutdown hook 
		context.registerShutdownHook();
//		
//		System.out.println("---------------------------------");
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);
		//context.registerShutdownHook();
		Ketchup k1 = (Ketchup) context.getBean("ketchup");
		System.out.println(k1);
	}

}
