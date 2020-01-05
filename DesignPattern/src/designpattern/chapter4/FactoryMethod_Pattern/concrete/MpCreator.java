package designpattern.chapter4.FactoryMethod_Pattern.concrete;

import java.util.Date;

import designpattern.chapter4.FactoryMethod_Pattern.framework.Item;
import designpattern.chapter4.FactoryMethod_Pattern.framework.ItemCreateor;

public class MpCreator extends ItemCreateor{

	@Override
	protected void requestItemsInfo() {
		System.out.println("�����ͺ��̽����� ���� ȸ�� ������ ������ �����ɴϴ�");
		
	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ȸ�� ������ ���� ���� �߽��ϴ�." + new Date());
		
	}

	@Override
	protected Item createItem() {
		
		// �۾�
		return new MpPotion();
	}

}
