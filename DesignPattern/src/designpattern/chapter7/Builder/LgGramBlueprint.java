package designpattern.chapter7.Builder;

public class LgGramBlueprint extends BluePrint {

	private Computer computer ;
	
	private String cpu;
	private String ram;
	private String storage;
	
	
	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7");
		
	}

	@Override
	public void setRam() {
		computer.setRam("8g");
		
	}

	@Override
	public void setStorage() {
		computer.setStorage("256g ssd");
		
	}

	@Override
	public Computer getComputer() {
	
		return computer;
	}

}
