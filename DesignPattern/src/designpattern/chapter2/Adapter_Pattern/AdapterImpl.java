package designpattern.chapter2.Adapter_Pattern;

public class AdapterImpl implements Adapter{
	
	
	
	@Override
	public Float twiceOf(Float f) {
	
		
		// return (float) Math.twoTime(f.doubleValue());
		
		// 추가 요구 사항
		return (float) Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		
		// 추가 요구사항 
		System.out.println("절반 함수 호출 시작");
		
		
		return (float) Math.half(f.doubleValue());
	}

	
	
}
