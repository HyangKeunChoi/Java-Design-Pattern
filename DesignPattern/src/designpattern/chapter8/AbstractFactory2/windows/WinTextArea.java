package designpattern.chapter8.AbstractFactory2.windows;

import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class WinTextArea implements TextArea{

	@Override
	public String getText() {
		
		return "윈도우 텍스트 에어리어";
	}

	
}
