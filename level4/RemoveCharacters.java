package level4;

public class RemoveCharacters {

	public static String removeGivenCharacters(String str, String charsToRemove) {
		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (charsToRemove.indexOf(c) == -1) {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		String charactersToRemove = "aeiou";

		String stringWithoutCharacters = removeGivenCharacters(inputString, charactersToRemove);
		System.out.println("String without given characters: " + stringWithoutCharacters);
	}
}