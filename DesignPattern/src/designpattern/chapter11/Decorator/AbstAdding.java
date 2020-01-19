package designpattern.chapter11.Decorator;

/**
 *  <h2><b>Role : </b>Decorator</h2>
 *  <p>
 *  ������Ʈ�� ����� ���Ͻ� ���ִ� �����մϴ�.
 *  </p>
 * @author hyangkeun choi
 */
abstract public class AbstAdding implements IBeverage {
	
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	@Override
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase() {
		return base;
	}
}