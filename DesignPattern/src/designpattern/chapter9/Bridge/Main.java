package designpattern.chapter9.Bridge;

public class Main {

	
	public static void main(String[] args) {
		// PrintMorseCode code = new PrintMorseCode(new DefaultMorseCodeFunction());
		// PrintMorseCode code = new PrintMorseCode(new SoundMorseCodeFunction());
		PrintMorseCode code = new PrintMorseCode(new FlashMorseCodeFunction());
		
		
		// garam 출력
		// code.g();code.a();code.r();code.a();code.m();
		code.g().a().r().a().m(); // 이렇게 써도됨
		
		
		
		
		
	}
}
