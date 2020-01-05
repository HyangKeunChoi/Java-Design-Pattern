package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;

public class MpPotion implements Item{

	@Override
	public void use() {
		System.out.println("마력 회복 !!");
		
	}

	
	
}
