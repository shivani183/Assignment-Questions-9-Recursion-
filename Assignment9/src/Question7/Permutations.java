package Question7;

public class Permutations {

	public static String swap(String x, int i, int j) {
		char ch;
		char[] charArray = x.toCharArray();
		ch = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = ch;
		return String.valueOf(charArray);
	}

	public void permute(String x, int first, int last) {
		if (first == last)
			System.out.println(x);
		else {
			for (int i = first; i <= last; i++) {
				x = swap(x, first, i);
				permute(x, first + 1, last);
				x = swap(x, first, i);
			}
		}
	}
	public static void main(String[] args) {

		String sub= "ABC";
		int n=sub.length();
		Permutations value= new Permutations();
		value.permute(sub, 0, n-1);
		
	}

}
