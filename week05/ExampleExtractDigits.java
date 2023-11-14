package week05;

import java.util.Scanner;

public class ExampleExtractDigits {

	public static void main(String[] args) {

		// read an integer
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer with more than 4 digits such as '1234567':");
		int number = scanner.nextInt();
		System.out.println("You entered integer:" + number);
		scanner.close();

		// get the digits
		final int BASE_10 = 10;
		int rightMostDigit;
		int leftDigits;
		//
		leftDigits = number;
		while (leftDigits > 0) {
			rightMostDigit = leftDigits % BASE_10;
			leftDigits = leftDigits / BASE_10;
			/**/System.out.println("leftDigits:" + leftDigits + "\trightMostDigit:" + rightMostDigit);
		}
	}

}
