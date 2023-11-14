package week05;

import java.util.Scanner;

public class Ch05_SentinelValue2 {

	/** Main method */
	public static void main(String[] args) {

		final int SENTINEL = -1;
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Read an initial data
		System.out.print("Enter an integer (the input ends if it is " //
				+ SENTINEL + "): ");
		int data = input.nextInt();

		// Keep reading data until the input is 0
		int sum = 0;
		while (data != SENTINEL) {
			sum += data;

			// Read the next data
//			System.out.print("Enter an integer (the input ends if it is 0): ");
			System.out.print("Enter an integer (the input ends if it is " //
					+ SENTINEL + "): ");
			data = input.nextInt();
		}

		System.out.println("The sum is " + sum);
	}

}
