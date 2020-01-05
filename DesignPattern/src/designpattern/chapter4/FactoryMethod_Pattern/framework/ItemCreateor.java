package designpattern.chapter4.FactoryMethod_Pattern.framework;

public abstract class  ItemCreateor {

	// 이걸 팩토리 메소드 라고 하고 이 메소드를 포함하는 패턴을 팩토리 메소드 패턴이라 한다 -> 근데 이것이 템플릿 메소드와 같다
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
	
	// 아이템을 생성하기전에 데이터베이서 아이템 정보 요청
	abstract protected void requestItemsInfo();
	
	// 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위한
	abstract protected void createItemLog();
	
	// 아이템을 생성하는 알고리즘
	abstract protected Item createItem();
	
	
}
