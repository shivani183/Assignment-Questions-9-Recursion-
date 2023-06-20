package Question4;

public class Exponent {
	public static int exponentOfNtoX(int n, int x) {
		if(n==0)
			return 0;
		if(n==1 || x==0)
			return 1;
		if(x==1)
			return n;
		return n * exponentOfNtoX(n, x-1);
	}

	public static void main(String[] args) {
		int n=1;
		int x=0;
		int result=exponentOfNtoX(n,x);
		System.out.println(result);

	}

}
