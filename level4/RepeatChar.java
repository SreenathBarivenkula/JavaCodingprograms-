package level4;

import java.util.HashMap;
import java.util.Map;

public class RepeatChar {

	public static void countRepeatedCharacters(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		System.out.println("Repeated characters and their counts:");

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("'" + entry.getKey() + "': " + entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String inputString = "programming";

		countRepeatedCharacters(inputString);
	}
}
