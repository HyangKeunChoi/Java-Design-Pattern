package designpattern.chapter14.Facade.System;

class HelpSystem01 { // �ۻ�带 �����ִ� Ŭ����

	public HelpSystem01() {
		System.out.println("Call Constructor" + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
		
	}
}
