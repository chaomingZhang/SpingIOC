package com.zcm.Ioc;

public class Bill implements Teacher {

	@Override
	public void teach(String course) {
		// TODO Auto-generated method stub
		System.out.println("Bill is teaching :"+course);
	}

}
