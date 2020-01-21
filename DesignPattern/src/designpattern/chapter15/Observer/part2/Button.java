package designpattern.chapter15.Observer.part2;

import java.util.Observable;

public class Button extends Observable{
	
	public void onClick() {
		setChanged();
		notifyObservers();
		
	}
}
