package designpattern.chapter6.Prototype2.DeepShallow;

public class Cat implements Cloneable{

	private String name;
	private Age age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public Age getAge() {
		return age;
	}
	
	public void setAge(Age age) {
		this.age = age;
	}
	
	public Cat copy() throws CloneNotSupportedException {
		
		Cat ret = (Cat)this.clone();
		
		
		// 여기라인 주석 처리하고 메인에서 실행해보기!
		// 명시적으로 깊은복사
		ret.setAge(new Age(this.age.getYear(), this.age.getValue()));
		
		
		return ret;
	}
}
