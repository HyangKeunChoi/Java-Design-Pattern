package designpattern.chapter7.Builder;

public class Main {
	public static void main(String[] args) {
	
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint()); // concrete builder ���赵
		
		
		//Computer computer = factory.makeAndGet();
		factory.make(); // ���赵�� �������� �����
		
		Computer computer = factory.getComputer(); // ������� ������� ������
		
		
		// Computer computer = new Computer("i7", "16g", "256g ssd");
		
		System.out.println(computer.toString());
		
		
		
		
		
		
	}
}
