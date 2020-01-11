package chapter1;

public class recursion2 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	
	
	public static int func(int n) {
		if (n == 0)
			return 0; // n이 0이라면  합은 0이다
		
		else {
			
			return n+ func(n-1); // 1~4까지 합
		}
		
	}
}
