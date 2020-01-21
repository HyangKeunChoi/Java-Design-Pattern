package designpattern.chapter16.part2.State;

public class Light {
	
	protected LightState lightState;
	
	// �͸�Ŭ����
	// ��ü�� ���¸� ����
	private LightState offState = new LightState() {
		
		// �Ѵ� �޼ҵ�
		@Override
		public void on() {
			System.out.println("Light ON"); // ���� ����
			lightState = onState;
		}
		
		@Override
		public void off() {
			System.out.println("Nothing"); // �ƹ��ϵ� �Ȼ����
		}
	};
	
	
	// �͸�Ŭ����
	// ��ü�� ���¸� ����
	private LightState onState = new LightState() {
		
		@Override
		public void on() {
			System.out.println("Nothing"); // �ƹ��ϵ� �Ȼ����
		}
		
		@Override
		public void off() {
			System.out.println("Light OFF"); // ���� ������
			lightState = offState;
		}
	};
	
	// ó������ �����ִ� ����
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

// ����
interface LightState {
	
	void on();
	void off();
	
}