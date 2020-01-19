package designpattern.chapter11.Decorator;

/**
 * <h2><b>Role : </b>ConcreteDecorator</h2>
 *  <p>
 *  �������� ��� �ν��Ͻ� �� �����̸�, å���� �߰��Ǵ� �κ��Դϴ�.
 *  </p>
 */
public class Espresso extends AbstAdding {

	static protected int espressoCount = 0;
	
	public Espresso(IBeverage base) {
		super(base);
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+getAddPrice();
	}
	
	/**
	 * ���������� �߰�����
	 * @return
	 */
	private static int getAddPrice(){
		espressoCount +=1;
		int addPrice = 100;
		
		if(espressoCount > 1){
			addPrice = 70;
		}
		return addPrice;
	}
	
}