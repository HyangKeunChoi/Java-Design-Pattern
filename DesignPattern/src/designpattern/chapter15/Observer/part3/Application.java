package designpattern.chapter15.Observer.part3;

import designpattern.chapter15.Observer.part3.Observable.Observer;

public class Application {
	
	public static void main(String[] args) {
		
		// Observer�� Observable�� �ǿ������� ����¹�
		
		// 1. ���׸�
		// 2. ��������Ʈ
		// 3. ����(Observable)�� ������(Observer)�� �ִ´�.
		
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
