package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;

public class HpPotion implements Item{

	@Override
	public void use() {
		System.out.println("체력 회복 !!");
		
	}

	
	
}
