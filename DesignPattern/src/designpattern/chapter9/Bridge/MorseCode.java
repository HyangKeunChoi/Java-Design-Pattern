package designpattern.chapter9.Bridge;

public class MorseCode {

	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	
	public void dot() {
		function.dot(); // ��������Ʈ
	 	
		
		
	}
	public void dash() {
		function.dash(); // ��������Ʈ
		
		
	}
	public void space() {
		function.space(); // ��������Ʈ
		
		
	}
	
}
