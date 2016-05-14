package com.zcm.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		JavaTrad j=(JavaTrad)ctx.getBean("java");
		j.go();
	}

}
