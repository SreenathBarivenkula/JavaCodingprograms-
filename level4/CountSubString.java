package level4;

public class CountSubString {

	public static int countSubstrings(String str) {
		int n = str.length();
		int count = 0;

		for (int start = 0; start < n; start++) {
			for (int end = start + 1; end <= n; end++) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String inputString = "4";

		int substringCount = countSubstrings(inputString);
		System.out.println("Number of substrings: " + substringCount);
	}
}
