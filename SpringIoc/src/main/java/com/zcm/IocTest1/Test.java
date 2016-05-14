package com.zcm.IocTest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("IocText.xml");
		JavaTrad j=(JavaTrad)ctx.getBean("ja");
		j.go();
	}

}
