package designpattern.chapter16.part1.Mediator;

public class Application {
	
	public static void main(String[] args) {
		
		// � �����ڿ���   colleague���� ������ �ϰ� , ���ε� colleague���� �����͸� ������ ���� 
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
