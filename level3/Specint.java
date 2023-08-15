package level3;

import java.util.Arrays;

public class Specint {

	public static int[] deleteElement(int[] arr, int elementToDelete) {
		int indexToDelete = -1;

		// Find the index of the element to delete
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elementToDelete) {
				indexToDelete = i;
				break;
			}
		}

		if (indexToDelete == -1) {
			System.out.println("Element not found in the array");
			return arr;
		}

		// Create a new array with one less element
		int[] newArray = new int[arr.length - 1];
		int newArrayIndex = 0;

		// Copy elements before the deleted element
		for (int i = 0; i < indexToDelete; i++) {
			newArray[newArrayIndex] = arr[i];
			newArrayIndex++;
		}

		// Copy elements after the deleted element
		for (int i = indexToDelete + 1; i < arr.length; i++) {
			newArray[newArrayIndex] = arr[i];
			newArrayIndex++;
		}

		return newArray;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 10, 15, 3, 12 };
		int elementToDelete = 10;

		System.out.println("Original array: " + Arrays.toString(arr));
		int[] newArray = deleteElement(arr, elementToDelete);

		if (newArray.length < arr.length) {
			System.out.println("Array after deleting " + elementToDelete + ": " + Arrays.toString(newArray));
		} else {
			System.out.println("Element not found in the array, no changes made.");
		}
	}
}
