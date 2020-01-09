package designpattern.chapter7.Builder;

public class ComputerFactory {

	// 역할 : 1 설계도를 가지고 있고 2 그 설계도를 바탕으로 만들고  3 만든것을 가져옴
	
	
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
