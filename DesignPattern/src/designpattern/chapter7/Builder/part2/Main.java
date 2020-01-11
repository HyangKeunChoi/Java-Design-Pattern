package designpattern.chapter7.Builder.part2;

public class Main {
	public static void main(String[] args) {
		
		Computer computer = ComputerBuilder
				// .start()
				.startWithCpu("i7") // 함수 이름을통해 cpu를 세팅한다는것을 알수있다 -> 가독성이 높아짐
				
				// .setCpu("i7")
				.setRam("8g")
				.setStorage("128g ssd")
				.build();
		
		System.out.println(computer.toString());
		
				
	}
}
