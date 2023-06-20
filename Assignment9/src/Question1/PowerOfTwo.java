package Question1;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(int n) {
		if(n<=0)
			return false;
		if(n==1)
			return true;
		if (n%2==0)
			return isPowerOfTwo(n/2);
		else
			return false;
	}
	public static void main(String[] args) {

		int n= 64;
		boolean result=isPowerOfTwo(n);
		System.out.println(result);
	}

}
