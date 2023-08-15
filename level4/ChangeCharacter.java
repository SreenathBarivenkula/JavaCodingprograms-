package level4;

public class ChangeCharacter {

	public static String changeSpecificCharacter(String str, char target, char replacement) {
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == target) {
				charArray[i] = replacement;
			}
		}

		return new String(charArray);
	}

	public static void main(String[] args) {
		String inputString = "Hello, World!";
		char targetChar = 'o';
		char replacementChar = 'x';

		String modifiedString = changeSpecificCharacter(inputString, targetChar, replacementChar);
		System.out.println("Modified string: " + modifiedString);
	}
}
