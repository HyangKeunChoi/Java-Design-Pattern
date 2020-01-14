package designpattern.chapter8.AbstractFactory2.windows;

import designpattern.chapter8.AbstractFactory2.abst.Button;
import designpattern.chapter8.AbstractFactory2.abst.GuiFactory;
import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class WinGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new WinTextArea() {
		};
	}

}
