package designpattern.chapter8.AbstractFactory2.linux;

import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
	
		return "리눅스 텍스트에어리어";
	}

	
}
