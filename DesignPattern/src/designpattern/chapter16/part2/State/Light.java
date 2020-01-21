package designpattern.chapter16.part2.State;

public class Light {
	
	protected LightState lightState;
	
	// 익명클래스
	// 객체의 상태를 정의
	private LightState offState = new LightState() {
		
		// 켜는 메소드
		@Override
		public void on() {
			System.out.println("Light ON"); // 불이 켜짐
			lightState = onState;
		}
		
		@Override
		public void off() {
			System.out.println("Nothing"); // 아무일도 안생긴다
		}
	};
	
	
	// 익명클래스
	// 객체의 상태를 정의
	private LightState onState = new LightState() {
		
		@Override
		public void on() {
			System.out.println("Nothing"); // 아무일도 안생긴다
		}
		
		@Override
		public void off() {
			System.out.println("Light OFF"); // 불이 꺼진다
			lightState = offState;
		}
	};
	
	// 처음에는 꺼져있는 상태
	public Light() {
		lightState = offState ;
	}
	
	public void on() {
		lightState.on();
	}
	
	public void off() {
		lightState.off();
	}
	
}

// 상태
interface LightState {
	
	void on();
	void off();
	
}