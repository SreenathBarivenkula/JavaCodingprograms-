package level3;

import java.util.HashMap;
import java.util.Map;

public class OccuranceStr {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 4, 3, 5, 1, 6, 2, 7 };

		Map<Integer, Integer> occurrences = findElementOccurrences(array);

		System.out.println("Element occurrences:");
		for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
		}
	}

	public static Map<Integer, Integer> findElementOccurrences(int[] array) {
		Map<Integer, Integer> occurrences = new HashMap<>();

		for (int num : array) {
			if (occurrences.containsKey(num)) {
				occurrences.put(num, occurrences.get(num) + 1);
			} else {
				occurrences.put(num, 1);
			}
		}

		return occurrences;
	}
}
