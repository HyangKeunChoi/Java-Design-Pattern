package designpattern.chapter4.FactoryMethod_Pattern.framework;

public abstract class  ItemCreateor {

	// �̰� ���丮 �޼ҵ� ��� �ϰ� �� �޼ҵ带 �����ϴ� ������ ���丮 �޼ҵ� �����̶� �Ѵ� -> �ٵ� �̰��� ���ø� �޼ҵ�� ����
	public Item create() {
		
		Item item;
		
		// step1 
		requestItemsInfo();
		
		// step 2
		item = createItem();
		
		// step 3
		createItemLog();
		
		
		return item;
		
	
		
		
		
		
	}
	
	// �������� �����ϱ����� �����ͺ��̼� ������ ���� ��û
	abstract protected void requestItemsInfo();
	
	// �������� ���� �� ������ ���� ���� �ҹ��� �����ϱ� ����
	abstract protected void createItemLog();
	
	// �������� �����ϴ� �˰���
	abstract protected Item createItem();
	
	
}
