package designpattern.chapter6.Prototype2.DeepShallow;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2020, 3));
		
		/* 얕은복사
		Cat yo = navi; // 나비가 가지고있는 주소값을 yo가 복사 => 얕은복사(주소값 복사)
		yo.setName("yo");
		*/
		
		// 깊은 복사
		Cat yo = navi.copy();
		yo.setName("yo");
		
		
		// yo.setAge(new Age(2020, 1)); // 밑에 두 라인을 위한 주석
		
		
		yo.getAge().setYear(2013); // 깊은복사가 이뤄지지않았다
		yo.getAge().setValue(2);
		
	
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println(navi.getAge().getValue());
		System.out.println(yo.getAge().getValue());
		
		
		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
		
	}
}
