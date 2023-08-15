package level4;

public class PalindromeNot {

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		String inputString = "racecar";

		if (isPalindrome(inputString)) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}
