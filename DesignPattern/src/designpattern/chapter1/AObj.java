package designpattern.chapter1;

public class AObj {

	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
	
		ainterface.funcA(); // 다른 객체의 기능을 사용하는것 -> 위임하다
		ainterface.funcA();
		

		

	}
}
