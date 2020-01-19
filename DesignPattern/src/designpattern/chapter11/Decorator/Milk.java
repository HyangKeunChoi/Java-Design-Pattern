package designpattern.chapter11.Decorator;

/**
 * <h2><b>Role : </b>ConcreteDecorator</h2>
 *  <p>
 *  �������� ��� �ν��Ͻ� �� �����̸�, å���� �߰��Ǵ� �κ��Դϴ�.
 *  </p>
 * @author hyangkeun choi
 *
 */
public class Milk extends AbstAdding {

	public Milk(IBeverage meterial) {
		super(meterial);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+50;
	}
	
}
