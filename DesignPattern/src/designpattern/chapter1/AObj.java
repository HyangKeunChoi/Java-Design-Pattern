package designpattern.chapter1;

public class AObj {

	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
	
		ainterface.funcA(); // �ٸ� ��ü�� ����� ����ϴ°� -> �����ϴ�
		ainterface.funcA();
		

		

	}
}
