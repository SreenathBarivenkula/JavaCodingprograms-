package level4;

public class CountVowelsAndConsonants {

	public static void countVowelsAndConsonants(String str) {
		str = str.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowelCount);
		System.out.println("Number of consonants: " + consonantCount);
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";

		countVowelsAndConsonants(inputString);
	}
}
