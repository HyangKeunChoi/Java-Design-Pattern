package designpattern.chapter8.AbstractFactory2.linux;

import designpattern.chapter8.AbstractFactory2.abst.Button;

public class LinuxButton implements Button{

	@Override
	public void click() {
		
		System.out.println("리눅스 버튼");
		
	}

	
}
