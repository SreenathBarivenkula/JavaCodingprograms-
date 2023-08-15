package level2;

import java.util.Scanner;

public class OccuranceSt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		System.out.print("Enter the character to count: ");
		char targetChar = scanner.next().charAt(0);

		int occurrenceCount = countOccurenceSt(inputString, targetChar);
		System.out.println("The character '" + targetChar + "' appears " + occurrenceCount + " times in the string.");
	}

	public static int countOccurenceSt(String str, char target) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == target) {
				count++;
			}
		}
		return count;
	}
}
