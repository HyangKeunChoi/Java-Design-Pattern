package designpattern.chapter9.Bridge;

public class FlashMorseCodeFunction implements MorseCodeFunction{

	@Override
	public void dot() {
		System.out.print(" ¹øÂ½ ");
		
	}

	@Override
	public void dash() {
		System.out.print(" ¹ÝÂ¦ ");
		
	}

	@Override
	public void space() {
		System.out.print(" - ");
		
	}

}
