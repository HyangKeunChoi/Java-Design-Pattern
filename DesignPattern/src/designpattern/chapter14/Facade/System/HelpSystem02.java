package designpattern.chapter14.Facade.System;

class HelpSystem02 { // �ۻ�带 �����ִ� Ŭ����

	public HelpSystem02() {
		System.out.println("Call Constructor" + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
		
	}
}
