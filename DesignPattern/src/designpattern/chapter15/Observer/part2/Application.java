package designpattern.chapter15.Observer.part2;

import java.util.Observable;
import java.util.Observer;

public class Application {
	
	public static void main(String[] args) {
		// Observable observable; // Oberservable 클래스 - - open declare 보기
		// Observer observer; // Oberserver 인터페이스 - open declare 보기
		
		Button button = new Button();
		
		button.addObserver(new Observer() {

			@Override
			public void update(Observable o, Object arg) {
				
				System.out.println(o+" is Clicked");
				
			}
				
		});
		
		button.onClick();
		button.onClick();
		button.onClick();
		
		
	}
}
