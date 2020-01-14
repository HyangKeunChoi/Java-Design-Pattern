package designpattern.chapter8.AbstractFactory2.windows;

import designpattern.chapter8.AbstractFactory2.abst.Button;

public class WinButton implements Button{

	@Override
	public void click() {
		
		
		System.out.println("윈도우 버튼");
		
	}

	
	
}
