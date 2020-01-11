package designpattern.chapter7.Builder.part2;

public class ComputerBuilder {
	
	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer("default", "default", "default");
		
		
		
	}
	
	/* 밑에 함수 때문에 주석
	 * public static ComputerBuilder start() {
	 * 
	 * 
	 * return new ComputerBuilder();
	 * 
	 * }
	 */
	
	public static ComputerBuilder startWithCpu(String cpu) {
		ComputerBuilder builder = new ComputerBuilder();
		builder.computer.setCpu(cpu);
		
		return builder;
	}
	
	
	/* 위에 함수 때문에 주석
	 * public ComputerBuilder setCpu(String string) {
	 * 
	 * computer.setCpu(string); return this; }
	 */
	
	public ComputerBuilder setRam(String string) {
		
		computer.setRam(string);
		return this;
	}
	
	
	public ComputerBuilder setStorage(String storage) {
		
		computer.setStorage(storage);
		
		return this;
		
	}
	
	
	public Computer build() {
		
		return this.computer;
	}
}
