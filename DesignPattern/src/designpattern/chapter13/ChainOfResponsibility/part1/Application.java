package designpattern.chapter13.ChainOfResponsibility.part1;

public class Application {
	public static void main(String[] args) {
		
		Calculator plus = new PlusCalculator();
		Calculator sub = new SubCalculator();
		
		plus.setNextCalculator(sub);
		Request request1 = new Request(1,2,"+"); // 3
		Request request2 = new Request(10,2,"-"); // 8
 		
		plus.process(request1);
		sub.process(request2);
	}
}
