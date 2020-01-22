package designpattern.chapter16.part3.Memento.abc;

public class Originator {
	
	String state; // 상태
	
	public Memento createMemento() { // 메멘토생성
		return new Memento(state);
	}
	
	public void restoreMement(Memento memento) {
		this.state = memento.getState();
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}