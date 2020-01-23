package designpattern.chapter16.part5.Proxy;

public class Proxy implements Subject{

	private Subject real;
	
	public Proxy(Subject real) {
		this.real = real;
	}
	
	@Override
	public void action1() {
		
		System.out.println("간단한 업무 by 프록시");
	}

	
	// 직접할수없는 업무 - 어려운 업무이기 때문에
	@Override
	public void action2() {
		this.real.action2();
		
	}

}
