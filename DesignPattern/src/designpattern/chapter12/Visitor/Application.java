package designpattern.chapter12.Visitor;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		
		// visitor������ ����ϴ� ���� : ��Ȱ�� ����� ��������
		
		ArrayList<Visitable> visitables = new ArrayList<Visitable>();
		visitables.add(new VisitableA(1));
		visitables.add(new VisitableA(2));
		visitables.add(new VisitableA(3));
		visitables.add(new VisitableA(4));
		visitables.add(new VisitableA(5));
		
		Visitor visitor = new VisitorA();
		
		
		for(Visitable visitable : visitables) { // visitor�� visitable�� �湮�ؼ� ��� ������ �Ѵ�
			visitable.accept(visitor);
		}
		
		System.out.println(((VisitorA)visitor).getAgeSum()); // 1���� 5���� ���� 15�� ���;� ��
		
	}
}
