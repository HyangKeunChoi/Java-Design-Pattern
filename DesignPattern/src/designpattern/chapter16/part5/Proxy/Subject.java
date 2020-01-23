package designpattern.chapter16.part5.Proxy;

public interface Subject {

	// 리소스가 적게 드는일
	void action1();
	
	// 리소스가 많이 드는 일 - 예를들어 네트워크나 메모리가 많이드는 일
	void action2();
}
