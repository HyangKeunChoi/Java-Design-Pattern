package designpattern.chapter13.ChainOfResponsibility.part2;

public class Armor implements Defense{
	
	private Defense nextDefense;
	private int def;
	
	

	public Armor() {
		
	}
	
	public Armor(int def) {
		this.def = def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	@Override
	public void defense(Attack attack) {
		
		// part1과 다른점 : 처리를 다안하고 nextDefense를 무조건 호출
		
		process(attack);
		
		
		if(nextDefense!= null) { 
			nextDefense.defense(attack);
		}
		
	}

	
	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def; // 갑옷의 체력을 def만큼 감소
		attack.setAmount(amount);
	}


	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
	
	
	
	
}
