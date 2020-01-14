package designpattern.chapter8.AbstractFactory2.linux;

import designpattern.chapter8.AbstractFactory2.abst.Button;
import designpattern.chapter8.AbstractFactory2.abst.GuiFactory;
import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		
		
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		
		return new LinuxTextArea();
	}

	
	
}
