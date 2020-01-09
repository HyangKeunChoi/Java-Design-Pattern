package designpattern.chapter7.Builder;

public class Main {
	public static void main(String[] args) {
	
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint()); // concrete builder 설계도
		
		
		//Computer computer = factory.makeAndGet();
		factory.make(); // 설계도를 바탕으로 만든다
		
		Computer computer = factory.getComputer(); // 만들어진 결과값을 가져옴
		
		
		// Computer computer = new Computer("i7", "16g", "256g ssd");
		
		System.out.println(computer.toString());
		
		
		
		
		
		
	}
}
