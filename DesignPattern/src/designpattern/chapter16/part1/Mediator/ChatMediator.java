package designpattern.chapter16.part1.Mediator;

public class ChatMediator extends Mediator{

	@Override
	public void mediate(String data) {
		
		for (Colleague colleague : colleagues) {
			
			// ���簡�ɼ� 
			colleague.handle(data);
			
			
		}
		
		
	}

}
