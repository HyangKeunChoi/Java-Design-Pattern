package designpattern.chapter16.part4.FlyWeight;

public class Main {
	public static void main(String[] args) {
		
		FlyWeightFactory factory = new FlyWeightFactory();
		
		Flyweight flyweight = factory.getFlyweight("A");
		
		System.out.println(flyweight);
		
		// �ٽ� ����
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		
		// �ٽ� �ѹ� �� ����
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
	}
	
}
