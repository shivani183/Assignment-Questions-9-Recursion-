package Question5;

public class Maximum {
	public static int maxValue(int arr[], int n) {
		if(n==1)
			return arr[0];
		return Math.max(arr[n-1], maxValue(arr, n-1));
	}

	public static void main(String[] args) {

		int arr[]= {2,63,9,-3,8,-34};
		int n=arr.length;
		int result =maxValue(arr, n);
		System.out.println(result);
	}

}
