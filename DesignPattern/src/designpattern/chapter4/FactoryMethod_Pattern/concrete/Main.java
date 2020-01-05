package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;
import designpattern.chapter4.FactoryMethod_Pattern.framework.ItemCreateor;

public class Main {

	public static void main(String[] args) {
		
		ItemCreateor creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
		
;	}
}
