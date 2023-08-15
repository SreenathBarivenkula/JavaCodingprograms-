package level3;

public class EvenOdd {

	public static void separateEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];

		int evenIndex = 0;
		int oddIndex = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenArray[evenIndex] = num;
				evenIndex++;
			} else {
				oddArray[oddIndex] = num;
				oddIndex++;
			}
		}

		System.out.println("Even numbers:");
		for (int num : evenArray) {
			System.out.print(num + " ");
		}

		System.out.println("\nOdd numbers:");
		for (int num : oddArray) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 2, 10, 15, 3, 12 };
		separateEvenOdd(arr);
	}
}
