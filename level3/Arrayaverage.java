package level3;

public class Arrayaverage {

	public static double calculateAverage(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty");
			return 0.0;
		}

		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		return (double) sum / arr.length;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 10, 15, 3, 12 };

		double average = calculateAverage(arr);
		System.out.println("Average of elements in the array: " + average);
	}
}
