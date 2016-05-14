package com.zcm.IocTest1;

public class Bill implements Teacher {

	@Override
	public void teach(String course) {
		// TODO Auto-generated method stub
			System.out.println("Bill is teaching :"+course);
	}

}
