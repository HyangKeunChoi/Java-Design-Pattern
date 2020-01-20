package designpattern.chapter12.Visitor;

public class VisitableA implements Visitable{

	private int age; // ³ªÀÌ
	
	public VisitableA(int age) {
		super();
		this.age = age;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
