package chapter1;
// recursion�� �׻� ���ѷ����� ������ ���� �ƴ�
public class recursion {	
	public static void main(String[] args) {
		func(4);
	}
	
	public static void func(int k) {
		if(k<=0) // base case : ��� �ϳ��� recursion�� ������ �ʴ� ��찡 �����ؾ���
			return;
		else {
			System.out.println("Hello..");
 			
			func(k-1); // Recursive case : recursion�� �ݺ��ϴٺ��� �ᱹ base case�� �����ؾ� �Ѵ�.
		}
		
	}

}
