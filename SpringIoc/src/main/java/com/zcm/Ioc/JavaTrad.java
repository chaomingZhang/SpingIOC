package com.zcm.Ioc;

public class JavaTrad implements Trad {
	private Teacher teacher;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		this.teacher.teach("Java");
	}

}
