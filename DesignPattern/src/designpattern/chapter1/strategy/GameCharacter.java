package designpattern.chapter1.strategy;

public class GameCharacter {
	
	// 접근점
	private Weapon weapon;
	
	
	
	//교환 가능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if (weapon == null) {
		
		 System.out.println("맨손공격");	
		} else {
			// 델리게이트 - 어떻게 공격하는지는 모른다
		weapon.attack();
	
		}
	}
	
}
