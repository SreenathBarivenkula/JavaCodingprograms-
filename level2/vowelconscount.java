package level2;

import java.util.Scanner;

public class vowelconscount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		int vowelCount = countVowels(inputString);
		int consonantCount = inputString.length() - vowelCount;

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);
	}

	public static int countVowels(String str) {
		str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive matching
		int count = 0;

		for (char c : str.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}

		return count;
	}

}
