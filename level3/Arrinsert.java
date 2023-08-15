package level3;

import java.util.Arrays;

public class Arrinsert {

	public static int[] insertAtEnd(int[] arr, int element) {
		int[] newArr = Arrays.copyOf(arr, arr.length + 1);
		newArr[newArr.length - 1] = element;
		return newArr;
	}

	public static int[] insertAtStart(int[] arr, int element) {
		int[] newArr = new int[arr.length + 1];
		newArr[0] = element;
		System.arraycopy(arr, 0, newArr, 1, arr.length);
		return newArr;
	}

	public static int[] insertAtMiddle(int[] arr, int element, int position) {
		if (position < 0 || position > arr.length) {
			System.out.println("Invalid position to insert");
			return arr;
		}

		int[] newArr = new int[arr.length + 1];
		System.arraycopy(arr, 0, newArr, 0, position);
		newArr[position] = element;
		System.arraycopy(arr, position, newArr, position + 1, arr.length - position);
		return newArr;
	}

	public static void main(String[] args) {
		int[] originalArray = { 5, 8, 2, 10, 15, 3, 12 };
		int elementToEnd = 20;
		int elementToStart = 7;
		int elementToInsert = 25;
		int insertPosition = 3;

		int[] newArray1 = insertAtEnd(originalArray, elementToEnd);
		System.out.println("Array after inserting at end: " + Arrays.toString(newArray1));

		int[] newArray2 = insertAtStart(originalArray, elementToStart);
		System.out.println("Array after inserting at start: " + Arrays.toString(newArray2));

		int[] newArray3 = insertAtMiddle(originalArray, elementToInsert, insertPosition);
		System.out.println("Array after inserting at position " + insertPosition + ": " + Arrays.toString(newArray3));
	}
}
