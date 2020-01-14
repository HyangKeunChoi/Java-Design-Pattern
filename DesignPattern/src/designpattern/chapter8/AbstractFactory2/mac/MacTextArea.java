package designpattern.chapter8.AbstractFactory2.mac;

import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class MacTextArea implements TextArea{

	@Override
	public String getText() {
		
		return "맥 텍스트 에어리어";
	}

	
}
