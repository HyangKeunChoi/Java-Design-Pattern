package designpattern.chapter7.Builder.part2;

public class Main {
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder
				// .start()
				.startWithCpu("i7") // �Լ� �̸������� cpu�� �����Ѵٴ°��� �˼��ִ� -> �������� ������
				
				// .setCpu("i7")
				.setRam("8g")
				.setStorage("128g ssd")
				.build();
		
		System.out.println(computer.toString());
		
				
	}
}
