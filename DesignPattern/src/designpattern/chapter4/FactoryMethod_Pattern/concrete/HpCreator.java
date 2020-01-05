package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import java.util.Date;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;
import designpattern.chapter4.FactoryMethod_Pattern.framework.ItemCreateor;

public class HpCreator extends ItemCreateor{

	@Override
	protected void requestItemsInfo() {
		System.out.println("데이터베이스에서 체력 회복 물약의 정보를 가져옵니다");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력 회복 물약을 새로 생성 했습니다." + new Date());
		
	}

	@Override
	protected Item createItem() {
		
		// 작업
		return new HpPotion();
	}

}
