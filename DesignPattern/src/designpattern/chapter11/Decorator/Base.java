package designpattern.chapter11.Decorator;

/**
* <h2><b>Role : </b>ConcreteComponent</h2>
*  <p>
*  Component�� �������� �ν��Ͻ��� �κ��̸�, å���� ��ü�Դϴ�.
*  </p>
* @author garam park
*
*/
public class Base implements IBeverage {

	@Override
	public int getTotalPrice() {
		return 0;
	}

}