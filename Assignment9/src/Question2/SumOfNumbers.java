package Question2;

public class SumOfNumbers {
	
	public static int sumOfNaturalNumb(int n) {
		if(n==1 || n==0)
			return n;
		return  n+sumOfNaturalNumb(n-1);
	}

	public static void main(String[] args) {
		int n= 5;
		int result=sumOfNaturalNumb(n);
		System.out.println(result);
	}

}
