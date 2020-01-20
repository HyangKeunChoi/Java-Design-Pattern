package designpattern.chapter14.Facade;

import designpattern.chapter14.Facade.System.Facade;

public class Application {
	
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.process();
		
	// 	HelpSystem01에 접근할수없다 default 접근 제한자 이므로
		
		
	}
	
}
