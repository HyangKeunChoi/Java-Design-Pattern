package designpattern.chapter15.Observer.part3;

import designpattern.chapter15.Observer.part3.Observable.Observer;

public class Application {
	
	public static void main(String[] args) {
		
		// Observer와 Observable을 실용적으로 만드는법
		
		// 1. 제네릭
		// 2. 델리게이트
		// 3. 내부(Observable)에 옵저버(Observer)를 넣는다.
		
		Button button = new Button();
		button.addObserver(new Observer<String>(){

			@Override
			public void update(Observable<String> o, String arg) {
				
				System.out.println(o + " is Clicked");
				
			}
		
			
			
		
		});
		
		
		button.onClick();
		button.onClick();
		button.onClick();
	}
}
