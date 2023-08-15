package level3;

public class Posneg {

	public static void main(String[] args) {
		int[] arr = { -5, 8, -2, 10, -15, 3, 12 };
		int positiveSum = 0;
		int negativeSum = 0;

		for (int num : arr) {
			if (num > 0) {
				positiveSum += num;
			} else if (num < 0) {
				negativeSum += num;
			}
		}

		System.out.println("Sum of positive elements: " + positiveSum);
		System.out.println("Sum of negative elements: " + negativeSum);
	}
}
