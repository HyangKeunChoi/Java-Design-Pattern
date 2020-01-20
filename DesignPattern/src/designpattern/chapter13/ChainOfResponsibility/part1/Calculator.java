package designpattern.chapter13.ChainOfResponsibility.part1;



public abstract class Calculator {

	private Calculator nextCalculator;
	
	public void setNextCalculator(Calculator sub) {
		this.nextCalculator = nextCalculator;
	}
	
	public boolean process(Request request) {
		if(operator(request)){
			
			return true;
		} else {
			if(nextCalculator != null)
				return nextCalculator.process(request);
			
			
		}
		return false;
	}
	
	
	abstract protected boolean operator(Request request);
	
}
