package level4;

public class StringSwap {

	public static void swapStrings(String[] strings) {
		if (strings.length != 2) {
			System.out.println("Please provide exactly two strings.");
			return;
		}

		String temp = strings[0];
		strings[0] = strings[1];
		strings[1] = temp;
	}

	public static void main(String[] args) {
		String[] strings = { "Hello", "World" };

		System.out.println("Before swapping: First string: " + strings[0] + ", Second string: " + strings[1]);

		swapStrings(strings);

		System.out.println("After swapping: First string: " + strings[0] + ", Second string: " + strings[1]);
	}
}
