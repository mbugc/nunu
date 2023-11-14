package week04;

import java.util.Scanner;

public class ExampleNumberGuessingV0{

	public static void main(String[] args) {

		// get a secret number
		double secretDouble = (Math.random() * 100);
		int secret = (int) secretDouble;
		System.out.println("secretDouble:" + secretDouble + " secret:" + secret);
		System.out.println("My secret number is larger or equal to 0 and less than 100.");
		final int INT_OUT_OF_SCOPE = 999;

		//
		Scanner in = new Scanner(System.in);
		int guess = INT_OUT_OF_SCOPE;

		//
		int i = 0;
		for (; i < 10 && (guess != secret); i++) {
			// read the first point
			System.out.println("Enter your guess:");
			guess = in.nextInt();
			if (guess == secret) {
				System.out.println("Great. You found my secret number:" + secret + ".");
				break;
			} else if (guess < secret) {
				System.out.println("My secret number is larger than " + guess + ".");
			} else if (guess > secret) {
				System.out.println("My secret number is smaller than " + guess + ".");
			} else {
				System.out.println("** WARNING** There is a problem.");
			}
		}
		if (i >= 10) {
			System.out.println("Game over." + " Too many guesses."
					+ " If you are smart, you should find the secret number in less than "
					+ i
					+ " guesses. Try again.");
		}

	}

}
