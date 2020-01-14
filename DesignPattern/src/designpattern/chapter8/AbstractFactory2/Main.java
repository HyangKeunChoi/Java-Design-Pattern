package designpattern.chapter8.AbstractFactory2;

import designpattern.chapter8.AbstractFactory2.abst.Button;
import designpattern.chapter8.AbstractFactory2.abst.GuiFactory;
import designpattern.chapter8.AbstractFactory2.abst.TextArea;
import designpattern.chapter8.AbstractFactory2.concrete.FactoryInstance;
import designpattern.chapter8.AbstractFactory2.linux.LinuxGuiFactory;
import designpattern.chapter8.AbstractFactory2.mac.MacGuiFactory;
import designpattern.chapter8.AbstractFactory2.windows.WinGuiFactory;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		GuiFactory fac = new LinuxGuiFactory();
		GuiFactory fac2 = new MacGuiFactory();
		GuiFactory fac3 = new WinGuiFactory();
		*/
		
		// 추가 사항 - concrete.package와 관련됨
		GuiFactory factory = FactoryInstance.getGuiFac();
		
		
		
		/*
		// linux
		Button button = fac.createButton();
		TextArea area =fac.createTextArea();
		button.click();
		System.out.println(area.getText());
		
		//  mac 
		Button button2 = fac2.createButton();
		TextArea area2 =fac2.createTextArea();
		button2.click();
		System.out.println(area2.getText());
		
		// window
		Button button3 = fac3.createButton();
		TextArea area3 =fac3.createTextArea();
		button3.click();
		System.out.println(area3.getText());  
		
		*/

		// 추가요구사항
		
		Button button = factory.createButton();
		TextArea area =factory.createTextArea();
		button.click();
		System.out.println(area.getText());
		
		System.out.println(System.getProperty("os.name")); //os를 나타내는 함수
		
		
		
		
		
	}
}
