package designpattern.chapter14.Facade.System;

class HelpSystem02 { // 퍼사드를 도와주는 클래스

	public HelpSystem02() {
		System.out.println("Call Constructor" + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call Process : " + getClass().getSimpleName());
		
	}
}
