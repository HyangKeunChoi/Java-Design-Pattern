package designpattern.chapter16.part4.FlyWeight;

public class Main {
	public static void main(String[] args) {
		
		FlyWeightFactory factory = new FlyWeightFactory();
		
		Flyweight flyweight = factory.getFlyweight("A");
		
		System.out.println(flyweight);
		
		// 다시 생성
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
		
		// 다시 한번 더 생성
		flyweight = factory.getFlyweight("A");
		System.out.println(flyweight);
		
	}
	
}
