package level3;

import java.util.Arrays;

public class Arrrev {

	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] originalArray = { 5, 8, 2, 10, 15, 3, 12 };

		System.out.println("Original array: " + Arrays.toString(originalArray));
		reverseArray(originalArray);
		System.out.println("Reversed array: " + Arrays.toString(originalArray));
	}
}
