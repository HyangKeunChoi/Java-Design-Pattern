package designpattern.chapter12.Visitor;

public class VisitorA implements Visitor{

	
	private int ageSum;
	
	public VisitorA() {
		ageSum = 0;
	}
	
	@Override
	public void visit(Visitable visitable) {
		
		if(visitable instanceof VisitableA) { // visitorA�϶� �̷��� ������ �Ѵ�
			
		ageSum += ((VisitableA) visitable).getAge();
		
		} else {
			
		}
		
			
		
	}

	public int getAgeSum() {
		return ageSum;
	}
	
	
	
}
