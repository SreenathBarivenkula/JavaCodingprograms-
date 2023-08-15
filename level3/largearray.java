package level3;

public class largearray {
	public static void main(String[] args) {
		int[] array = { 10, 5, 8, 20, 15 };

		int secondLargest = findSecondLargest(array);

		System.out.println("Second largest element: " + secondLargest);
	}

	public static int findSecondLargest(int[] array) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : array) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}
}
