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
		function.dot(); // µ®∏Æ∞‘¿Ã∆Æ
	 	
		
		
	}
	public void dash() {
		function.dash(); // µ®∏Æ∞‘¿Ã∆Æ
		
		
	}
	public void space() {
		function.space(); // µ®∏Æ∞‘¿Ã∆Æ
		
		
	}
	
}
