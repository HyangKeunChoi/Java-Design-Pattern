package designpattern.chapter16.part3.Memento;

import java.lang.Thread.State;
import java.util.Stack;
import java.util.StringTokenizer;


import designpattern.chapter16.part3.Memento.abc.Memento;
import designpattern.chapter16.part3.Memento.abc.Originator;


public class Application {

	public static void main(String[] args) {
		
		Stack<Memento> mementos = new Stack<>(); // caretaker
		
		Originator originator = new Originator();
		
		originator.setState("state 1");
		mementos.push(originator.createMemento());
		
		// 메멘토에서 protected 사용하는 이유 - 외부에서 건들지 못하도록하기 위해
//		Memento memento = new Memento();	// 생성X
//		memento.getState();		//X
		
		originator.setState("state 2");
		mementos.push(originator.createMemento());
		originator.setState("state 3");
		mementos.push(originator.createMemento());
		originator.setState("state Final");
		mementos.push(originator.createMemento());
		
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state Final
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 3
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 2
		originator.restoreMement(mementos.pop());
		System.out.println(originator.getState());//state 1
	
		
	}
}