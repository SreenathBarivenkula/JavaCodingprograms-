package level3;

public class Arraysum {

	public static int calculateSum(int[] arr) {
		int sum = 0;

		for (int num : arr) {
			sum += num;
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 10, 15, 3, 12 };

		int sum = calculateSum(arr);
		System.out.println("Sum of elements in the array: " + sum);
	}
}
