package designpattern.chapter1.strategy;

public class GameCharacter {
	
	// ������
	private Weapon weapon;
	
	
	
	//��ȯ ����
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if (weapon == null) {
		
		 System.out.println("�Ǽհ���");	
		} else {
			// ��������Ʈ - ��� �����ϴ����� �𸥴�
		weapon.attack();
	
		}
	}
	
}
