package designpattern.chapter9.Bridge;

public class SoundMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		System.out.print("��");
		
	}

	@Override
	public void dash() {
		System.out.print("��~");
		
	}

	@Override
	public void space() {
		System.out.print("��");
		
	}

}