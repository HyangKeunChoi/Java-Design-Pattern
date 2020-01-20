package designpattern.chapter12.Visitor;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		
		// visitor패턴을 사용하는 이유 : 원활한 소통과 유지보수
		
		ArrayList<Visitable> visitables = new ArrayList<Visitable>();
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		
		Visitor visitor = new VisitorA();
		
		
		for(Visitable visitable : visitables) { // visitor가 visitable을 방문해서 어떤한 동작을 한다
			visitable.accept(visitor);
		}
		
		System.out.println(((VisitorA)visitor).getAgeSum()); // 1부터 5까지 합인 15가 나와야 함
		
	}
}
