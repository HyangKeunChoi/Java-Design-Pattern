package designpattern.chapter12.Visitor;

public class VisitorA implements Visitor{

	
	private int ageSum;
	
	public VisitorA() {
		ageSum = 0;
	}
	
	@Override
	public void visit(Visitable visitable) {
		
		if(visitable instanceof VisitableA) { // visitorA일때 이러한 동작을 한다
			
		ageSum += ((VisitableA) visitable).getAge();
		
		} else {
			
		}
		
			
		
	}

	public int getAgeSum() {
		return ageSum;
	}
	
	
	
}
