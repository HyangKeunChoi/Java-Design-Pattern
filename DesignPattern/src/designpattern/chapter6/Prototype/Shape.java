package designpattern.chapter6.Prototype;

public class Shape implements Cloneable { // Cloneable은 이미 정의되어있는 인터페이스

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	// 클론이라는 메소드도 포함되어 있음
	
}
