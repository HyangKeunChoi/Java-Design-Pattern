package designpattern.chapter16.part3.Memento.abc;

public class Memento {

	String state; // originator에 저장해야될 상태
	
	protected Memento(String state) { // 메멘토를 밖에서(외부에서) 접근하지못하도록 protected로 선언한다
		this.state = state;
	}

	protected String getState() {
		return this.state;
	}

}
