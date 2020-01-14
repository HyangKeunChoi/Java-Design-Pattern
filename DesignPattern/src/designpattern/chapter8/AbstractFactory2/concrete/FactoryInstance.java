package designpattern.chapter8.AbstractFactory2.concrete;

import designpattern.chapter8.AbstractFactory2.abst.Button;
import designpattern.chapter8.AbstractFactory2.abst.GuiFactory;
import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFac() {
		
		// os를 나타내는 함수
		switch(getOsCode()) {
	//	switch (2) {
		case 0:
			return new MacGuiFactory();
		case 1:
			return new LinuxGuiFactory();
		case 2:
			return new WinGuiFactory();
		}
					
		return null;
	}

	// os를 나타내는 함수를 정의
	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Windows 10")) {
		return 2;
		}
		return 1;
	}
	

	
}

// 각 os의 클래스를 다 여기다 붙인다

class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		
		
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		
		return new LinuxTextArea();
	}

	
	
}

class LinuxTextArea implements TextArea{

	@Override
	public String getText() {
	
		return "리눅스 텍스트에어리어";
	}

	
}	
	
class LinuxButton implements Button{

	@Override
	public void click() {
		
		System.out.println("리눅스 버튼");
		
	}

	
}

class MacButton implements Button{

	@Override
	public void click() {
		
		
		System.out.println("맥 버튼");
		
	}

	
	
}

class MacGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new MacTextArea() {
		};
	}

}

class MacTextArea implements TextArea{

	@Override
	public String getText() {
		
		return "맥 텍스트 에어리어";
	}

	
}

class WinButton implements Button{

	@Override
	public void click() {
		
		
		System.out.println("윈도우 버튼");
		
	}

	
	
}

class WinGuiFactory implements GuiFactory{

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

class WinTextArea implements TextArea{

	@Override
	public String getText() {
		
		return "윈도우 텍스트 에어리어";
	}

	
}