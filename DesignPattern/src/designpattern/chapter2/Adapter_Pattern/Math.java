package designpattern.chapter2.Adapter_Pattern;

public class Math {
	
	// 2��
	public static double twoTime(double num) {
		
		return num*2;
	}
	
	// ����
	public static double half(double num) {
		
		return num/2;
	}
	
	// ��ȭ�� �˰���
	public static Double doubled(Double d) {
		return d*2;
	}
	
}
