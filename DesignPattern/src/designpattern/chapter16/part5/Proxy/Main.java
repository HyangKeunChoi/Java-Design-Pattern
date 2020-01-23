package designpattern.chapter16.part5.Proxy;

public class Main {
	public static void main(String[] args) {
		
		Subject real = new RealSubject();
		
		// 프록시가 여러개 
		// 중요업무일때만 real한테 요청
		Subject proxy1 = new Proxy(real);
		
		Subject proxy2 = new Proxy(real);
		
		proxy1.action1();
		proxy2.action1();
				
		proxy1.action2();
		proxy2.action2();
	}
}
