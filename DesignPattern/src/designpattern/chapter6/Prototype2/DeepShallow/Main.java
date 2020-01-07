package designpattern.chapter6.Prototype2.DeepShallow;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2020, 3));
		
		/* ��������
		Cat yo = navi; // ���� �������ִ� �ּҰ��� yo�� ���� => ��������(�ּҰ� ����)
		yo.setName("yo");
		*/
		
		// ���� ����
		Cat yo = navi.copy();
		yo.setName("yo");
		
		
		// yo.setAge(new Age(2020, 1)); // �ؿ� �� ������ ���� �ּ�
		
		
		yo.getAge().setYear(2013); // �������簡 �̷������ʾҴ�
		yo.getAge().setValue(2);
		
	
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
		
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		
	}
}
