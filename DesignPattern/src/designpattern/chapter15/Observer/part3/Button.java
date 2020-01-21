package designpattern.chapter15.Observer.part3;

import designpattern.chapter15.Observer.part3.Observable.Observer;

public class Button {
	
	public Button() {
		observable = new Observable<String>();
	}
	
	// observable을 멤버변수로 갖는다.
	
	private Observable<String> observable;
	
	public void addObserver(Observer<String> o ) {
		observable.addObserver(o);
	}
	
	
	public void notifyObservers() {
		observable.setChanged();
		observable.notifyObservers(null);
		
		
	}


	public void onClick() {
		notifyObservers();
		
	}
	
	
	
}
