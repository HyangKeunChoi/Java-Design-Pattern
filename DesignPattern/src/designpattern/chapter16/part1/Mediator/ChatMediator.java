package designpattern.chapter16.part1.Mediator;

public class ChatMediator extends Mediator{

	@Override
	public void mediate(String data) {
		
		for (Colleague colleague : colleagues) {
			
			// 중재가능성 
			colleague.handle(data);
			
			
		}
		
		
	}

}
