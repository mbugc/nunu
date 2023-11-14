package week04;

import java.util.Scanner;

public class Ch03_AdditionQuiz {

	public static void main(String[] args) {
		
		int number1 = (int) (System.currentTimeMillis() % 10);
		int number2 = (int) (System.currentTimeMillis() / 10 % 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("What is " + number1 + " + " + number2 + "? ");
		
		for (boolean result = false; result != true; ) {
			int answer = input.nextInt();
			
			System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
			
			result = (number1 + number2 == answer);
		}
		
		boolean result = false;
		while (result == false) {
			
		}
		
	}
}