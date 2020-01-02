package designpattern.chapter2.Adapter_Pattern;

public class AdapterImpl implements Adapter{
	
	
	
	@Override
	public Float twiceOf(Float f) {
	
		
		// return (float) Math.twoTime(f.doubleValue());
		
		// �߰� �䱸 ����
		return (float) Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		
		// �߰� �䱸���� 
		System.out.println("���� �Լ� ȣ�� ����");
		
		
		return (float) Math.half(f.doubleValue());
	}

	
	
}
