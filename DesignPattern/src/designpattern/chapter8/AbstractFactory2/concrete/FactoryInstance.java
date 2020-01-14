package designpattern.chapter8.AbstractFactory2.concrete;

import designpattern.chapter8.AbstractFactory2.abst.Button;
import designpattern.chapter8.AbstractFactory2.abst.GuiFactory;
import designpattern.chapter8.AbstractFactory2.abst.TextArea;

public class FactoryInstance {

	public static GuiFactory getGuiFac() {
		
		// os�� ��Ÿ���� �Լ�
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

	// os�� ��Ÿ���� �Լ��� ����
	private static int getOsCode() {
		if(System.getProperty("os.name").equals("Windows 10")) {
		return 2;
		}
		return 1;
	}
	

	
}

// �� os�� Ŭ������ �� ����� ���δ�

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
	
		return "������ �ؽ�Ʈ�����";
	}

	
}	
	
class LinuxButton implements Button{

	@Override
	public void click() {
		
		System.out.println("������ ��ư");
		
	}

	
}

class MacButton implements Button{

	@Override
	public void click() {
		
		
		System.out.println("�� ��ư");
		
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
		
		return "�� �ؽ�Ʈ �����";
	}

	
}

class WinButton implements Button{

	@Override
	public void click() {
		
		
		System.out.println("������ ��ư");
		
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
		
		return "������ �ؽ�Ʈ �����";
	}

	
}