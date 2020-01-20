package designpattern.chapter13.ChainOfResponsibility.part2;

public class Application {
	public static void main(String[] args) {
		
		// å�ӻ罽���Ͽ����� �ϳ��� ��ü���� �� å���� ���� �ʾƵ� �ȴ�
		// �������� ��ü�� å���� ���ÿ� ��� �ȴ�.
		
		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor(10);
		Armor armor2 = new Armor(15);
		
		
		armor1.setNextDefense(armor2);
		
		// ù��° ����
		armor1.defense(attack); // �Ƹ� 1��  �����ϱ�
		
		
		// 100 - 10 - 15
		System.out.println(attack.getAmount()); // �Ƹ� 1 Ȯ��
		
		
		
		
		
		
		/*	 ����	 : å���� �߰��ϴ� ���� �ǹ� */
		
		Defense defense = new Defense() {
			@Override
			public void defense(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount-=50);
				
			}
			
			
		};
		
		// ���ӵ��߿� �߰��� �Ƹ� ����
		armor2.setNextDefense(defense);
	
		attack.setAmount(100);
		
		// �ι�° ����
		armor1.defense(attack);
		
		// 75���� 50�� ���� 25
		System.out.println(attack.getAmount()); 
	}
}
