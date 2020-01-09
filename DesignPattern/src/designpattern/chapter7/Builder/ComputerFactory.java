package designpattern.chapter7.Builder;

public class ComputerFactory {

	// ���� : 1 ���赵�� ������ �ְ� 2 �� ���赵�� �������� �����  3 ������� ������
	
	
	private BluePrint print;
	
	public void setBlueprint(BluePrint print) { //
		this.print = print;
	
	}

	
	public void make() {
		
		print.setRam();
		print.setCpu();
		print.setStorage();
		
	}

	public Computer getComputer() {
		
		return print.getComputer();
	}
	
}
