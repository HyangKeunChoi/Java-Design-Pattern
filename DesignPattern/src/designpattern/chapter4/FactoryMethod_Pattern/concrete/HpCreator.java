package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import java.util.Date;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;
import designpattern.chapter4.FactoryMethod_Pattern.framework.ItemCreateor;

public class HpCreator extends ItemCreateor{

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ü�� ȸ�� ������ ������ �����ɴϴ�");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("ü�� ȸ�� ������ ���� ���� �߽��ϴ�." + new Date());
		
	}

	@Override
	protected Item createItem() {
		
		// �۾�
		return new HpPotion();
	}

}
