package designpattern.chapter9.Bridge;

public class PrintMorseCode extends MorseCode {

	
	public PrintMorseCode(MorseCodeFunction function) {
		super(function);
		
	}
	// garamÀ» Ãâ·Â
	public PrintMorseCode g() {
		dash();dash();dot();space();
		return this;
	}
	public PrintMorseCode a() {
		dot();dash();space();
		return this;
	}
	public PrintMorseCode r() {
		dot();dash();dot();space();
		return this;
	}
	public PrintMorseCode m() {
		dash();dash();space();
		return this;
	}
	
	
}	
