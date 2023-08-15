package level3;

import java.util.HashMap;
import java.util.Map;

public class arraydup {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 9, 9 };

		findDuplicates(array);

	}

	public static void findDuplicates(int[] array) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : array) {
			if (frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num) + 1);
			} else {
				frequencyMap.put(num, 1);
			}
		}

		System.out.println("Duplicate elements:");
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
