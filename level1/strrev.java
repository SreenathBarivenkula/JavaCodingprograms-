package level1;

public class strrev {

	public static void main(String[] args) {
		String original = "APPLE";
		String reversed = reverseString(original);
		System.out.println("Original string: " + original);
		System.out.println("Reversed string: " + reversed);
	}

	private static String reverseString(String input) {

		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			// Swap characters at left and right indices
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;

			// Move the pointers towards the center
			left++;
			right--;
		}

		return new String(charArray);

	}

}
