package designpattern.chapter16.part4.FlyWeight;

import java.util.Map;
import java.util.TreeMap;

public class FlyWeightFactory {
	
	Map<String, Flyweight> pool;
	
	public FlyWeightFactory() {
		pool = new TreeMap<>();
	}
	
	public Flyweight getFlyweight(String key) {
		
		Flyweight flyweight = pool.get(key);
		
		if(flyweight == null) {
			flyweight = new Flyweight(key);
			
			pool.put(key, flyweight); // Ǯ(poll)�� �ֱ�
			
			System.out.println("���� ����" + key);
		} else {
			System.out.println("���� " + key);
		}
			return flyweight;
	}
	
}
