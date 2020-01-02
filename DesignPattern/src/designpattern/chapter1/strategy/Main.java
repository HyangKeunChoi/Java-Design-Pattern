package designpattern.chapter1.strategy;

public class Main {
	public static void main(String[] args) {
		
		 
		
		GameCharacter character = new GameCharacter();
		
		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		// 유지보수 사항
		character.setWeapon(new Ax());
		
		
		character.attack();
	}
}
