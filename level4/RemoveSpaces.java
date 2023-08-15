package level4;

public class RemoveSpaces {

	public static String removeWhiteSpaces(String str) {
		return str.replaceAll("\\s", "");
	}

	public static void main(String[] args) {
		String inputString = "This is a sample string with spaces.";

		String stringWithoutSpaces = removeWhiteSpaces(inputString);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}
}
