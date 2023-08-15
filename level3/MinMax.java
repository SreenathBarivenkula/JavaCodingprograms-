package level3;

public class MinMax {

	public static void findMinMax(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return;
		}

		int min = arr[0];
		int max = arr[0];

		for (int num : arr) {
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 10, 15, 3, 12 };
		findMinMax(arr);
	}
}
