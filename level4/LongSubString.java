package level4;

import java.util.HashMap;
import java.util.Map;

public class LongSubString {
	public static String findLongestSubstring(String str) {
		Map<Character, Integer> charIndexMap = new HashMap<>();
		int maxLength = 0;
		int start = 0;
		int longestStart = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (charIndexMap.containsKey(c) && charIndexMap.get(c) >= start) {
				start = charIndexMap.get(c) + 1;
			}

			charIndexMap.put(c, i);

			if (i - start + 1 > maxLength) {
				maxLength = i - start + 1;
				longestStart = start;
			}
		}

		return str.substring(longestStart, longestStart + maxLength);
	}

	public static void main(String[] args) {
		String inputString = "abcabcbb";

		String longestSubstring = findLongestSubstring(inputString);
		System.out.println("Longest substring without repeating characters: " + longestSubstring);
	}
}
