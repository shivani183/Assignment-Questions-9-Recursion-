package Question8;

public class ProductOfArray {
	public static int productOfArrayElements(int temp[], int n) {
		int mul=1;
		for(int i=0;i<n;i++) {
			mul=mul*temp[i];
		}
		return mul;
		
	}

	public static void main(String[] args) {

		int[] sum={1, 2, 3, 4, 5, 6};
		int n=sum.length;
		int result=productOfArrayElements(sum, n);
		System.out.println(result);
	}

}
