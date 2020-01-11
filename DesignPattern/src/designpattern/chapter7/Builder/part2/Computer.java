package designpattern.chapter7.Builder.part2;

public class Computer {
	
	
	/*
	 * @param cpu입니다
	 * @param ram램입니다.
	 * @param storage 저장소 입니다.
	 */
	private String cpu;
	private String ram;
	private String storage;
	
	
	
	public Computer(String cpu, String ram, String storage) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.storage = storage;
	}
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	
	@Override
	public String toString() {
	
		return cpu+"  "+ram+"  "+storage;
	}
	
	
	
}
