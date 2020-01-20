package designpattern.chapter13.ChainOfResponsibility.part2;

public class Application {
	public static void main(String[] args) {
		
		// 책임사슬패턴에서는 하나의 객체에만 그 책임을 주지 않아도 된다
		// 여러가지 객체가 책임을 동시에 지어도 된다.
		
		Attack attack = new Attack(100);
		
		Armor armor1 = new Armor(10);
		Armor armor2 = new Armor(15);
		
		
		armor1.setNextDefense(armor2);
		
		// 첫번째 공격
		armor1.defense(attack); // 아머 1에  공격하기
		
		
		// 100 - 10 - 15
		System.out.println(attack.getAmount()); // 아머 1 확인
		
		
		
		
		
		
		/*	 동적	 : 책임을 추가하는 것을 의미 */
		
		Defense defense = new Defense() {
			@Override
			public void defense(Attack attack) {
				int amount = attack.getAmount();
				attack.setAmount(amount-=50);
				
			}
			
			
		};
		
		// 게임도중에 추가로 아머 착용
		armor2.setNextDefense(defense);
	
		attack.setAmount(100);
		
		// 두번째 공격
		armor1.defense(attack);
		
		// 75에서 50을 더뺀 25
		System.out.println(attack.getAmount()); 
	}
}
