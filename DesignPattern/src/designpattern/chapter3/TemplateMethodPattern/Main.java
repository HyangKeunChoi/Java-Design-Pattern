package designpattern.chapter3.TemplateMethodPattern;

import designpattern.chapter3.dp.AbstGameConnectHelper;
import designpattern.chapter3.dp.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
		
	}
}
