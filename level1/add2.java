
package level1;

import java.util.Scanner;

public class add2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number  : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Second number  : ");
		int num2 = sc.nextInt();
		int sum = addNumbers(num1, num2);
		System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

	}

	public static int addNumbers(int a, int b) {
		while (b != 0) {
			int carry = a & b; // Calculate the common set bits as carry
			a = a ^ b; // XOR of a and b gives the sum without carry
			b = carry << 1; // Left shift carry by 1 to add to the next position
		}
		return a;
	}
}