package com.springCore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/ref/refconfig.xml");
		A aobj = (A) context.getBean("aref");
		
		System.out.println(aobj.getX());
		System.out.println(aobj.getObj().getY());
		
		System.out.println(aobj);//it carry A object

	}

}
