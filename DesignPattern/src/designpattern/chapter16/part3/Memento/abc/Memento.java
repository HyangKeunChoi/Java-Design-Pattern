package designpattern.chapter16.part3.Memento.abc;

public class Memento {

	String state; // originator�� �����ؾߵ� ����
	
	protected Memento(String state) { // �޸��並 �ۿ���(�ܺο���) �����������ϵ��� protected�� �����Ѵ�
		this.state = state;
	}

	protected String getState() {
		return this.state;
	}

}
