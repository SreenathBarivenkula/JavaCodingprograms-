package level3;

import java.util.HashSet;
import java.util.Set;

public class intersectarray {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 3, 4, 5, 6, 7 };

		int[] intersection = findIntersection(array1, array2);

		System.out.print("Intersection of arrays: ");
		for (int num : intersection) {
			System.out.print(num + " ");
		}
	}

	public static int[] findIntersection(int[] array1, int[] array2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> intersectionSet = new HashSet<>();

		for (int num : array1) {
			set1.add(num);
		}

		for (int num : array2) {
			if (set1.contains(num)) {
				intersectionSet.add(num);
			}
		}

		int[] intersection = new int[intersectionSet.size()];
		int index = 0;
		for (int num : intersectionSet) {
			intersection[index++] = num;
		}

		return intersection;
	}
}
