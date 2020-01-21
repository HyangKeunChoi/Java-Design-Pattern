package designpattern.chapter16.part1.Mediator;

public abstract class Colleague {
	
	private Mediator mediator; // 어디 속해있는지
	
	public boolean join(Mediator mediator) {
		
		if(mediator == null)
			return false;
		
		this.mediator = mediator;
		return mediator.addColleague(this);
	}
	
	
	public void sendData(String data) {
		if(mediator!= null )
			mediator.mediate(data);
	}
	
	abstract public void handle(String data); 
}
