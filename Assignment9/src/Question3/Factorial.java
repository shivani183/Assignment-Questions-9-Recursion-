package Question3;

public class Factorial {
	public static int factorialOfN(int n) {
		if(n==1 || n==0)
			return n;
		return n*factorialOfN(n-1);}

	public static void main(String[] args) {

		int n =5;
		int result= factorialOfN(n);
		System.out.println(result);
	}

}
