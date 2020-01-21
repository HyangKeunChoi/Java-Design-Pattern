package designpattern.chapter16.part1.Mediator;

public class Application {
	
	public static void main(String[] args) {
		
		// 어떤 중재자에게   colleague들이 조인을 하고 , 조인된 colleague들이 데이터를 보내는 구조 
		Mediator mediator = new ChatMediator();
		
		Colleague colleague1 = new ChatColleage();
		Colleague colleague2 = new ChatColleage();
		Colleague colleague3 = new ChatColleage();
		
		
		colleague1.join(mediator);
		colleague2.join(mediator);
		colleague3.join(mediator);
		
		colleague1.sendData("AAA");
		colleague2.sendData("BBB");
		colleague3.sendData("CCC");
	}
}
