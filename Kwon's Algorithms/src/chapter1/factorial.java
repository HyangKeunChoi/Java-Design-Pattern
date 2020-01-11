package chapter1;

public class factorial {
	
	public static int factorial(int n) {
		if(n==0 )
			return 1;
		else
			return n*factorial(n-1);
	}
	
	// 피보나치
	
	public int fibonacci(int n) {
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	
	

}
