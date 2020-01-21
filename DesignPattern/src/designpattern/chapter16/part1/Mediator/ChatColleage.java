package designpattern.chapter16.part1.Mediator;

public class ChatColleage extends Colleague{

	@Override
	public void handle(String data) {
		
		System.out.println(this+ " - "+data);
		
	}

}
