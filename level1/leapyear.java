
package level1;

import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the year you want to check : ");
		int year = scanner.nextInt();

		boolean isLeapYear = checkLeapYear(year);

		if (isLeapYear) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	public static boolean checkLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}