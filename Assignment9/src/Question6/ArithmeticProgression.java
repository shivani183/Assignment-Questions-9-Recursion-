package Question6;

public class ArithmeticProgression {
	public static int NthTermIs(int a, int d, int n) {
		return a+((n-1)*d);
	}

	public static void main(String[] args) {

		int a=5;
		int d=2;
		int n=10;
		int result=NthTermIs(a,d,n);
		System.out.println(result);
	}

}
