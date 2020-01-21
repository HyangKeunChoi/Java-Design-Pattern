package designpattern.chapter15.Observer.part1;

import designpattern.chapter15.Observer.part1.Button.OnClickListener;

public class Application {
	
	public static void main(String[] args) {
		
		Button button = new Button();
		
		
		button.setClickListener(new ButtonClick()); // �� �κ��� �͸� Ŭ������ ���⵵ ��
		
		button.onClick();
		
		
		
	}
}

class ButtonClick implements OnClickListener{

	@Override
	public void onClick(Button button) {
		System.out.println(button + " is Clicked");
		
	}
	
	
}