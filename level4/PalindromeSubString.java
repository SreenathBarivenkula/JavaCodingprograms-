package level4;

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubString {

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

	public static Set<String> findAllPalindromeSubstrings(String str) {
		Set<String> palindromeSubstrings = new HashSet<>();

		for (int start = 0; start < str.length(); start++) {
			for (int end = start + 1; end <= str.length(); end++) {
				String substring = str.substring(start, end);
				if (isPalindrome(substring)) {
					palindromeSubstrings.add(substring);
				}
			}
		}

		return palindromeSubstrings;
	}

	public static void main(String[] args) {
		String inputString = "ababa";

		Set<String> palindromeSubstrings = findAllPalindromeSubstrings(inputString);
		System.out.println("Palindrome substrings: " + palindromeSubstrings);
	}
}
