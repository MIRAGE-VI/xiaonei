package com.xiaonei.mirage.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		TestService ts=(TestService) ac.getBean("testService");
		System.out.println(ts.getName());
	}

}
