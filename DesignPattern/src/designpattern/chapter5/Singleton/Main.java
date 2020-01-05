package designpattern.chapter5.Singleton;

public class Main {
	
	public static void main(String[] args) {
		SystemSpeaker speaker1 = SystemSpeaker.getInstance(); // 새로 생성 이라고 나옴
		SystemSpeaker speaker2 = SystemSpeaker.getInstance(); // 이미 생성이라고 나옴
		
		// 5, 5
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		//11, 11
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		// 22, 22
		speaker2.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}
	
}
