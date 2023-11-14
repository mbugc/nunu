package week04;

import java.util.Scanner;

public class SumOfDigitsV0 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		while(number > 1000 || number < 0) {
			System.out.println("You have not entered a number between 0 and 1000, enter again: ");
			number = input.nextInt();
		}
		
		int sumOfDigits = ( number / 100 ) + (( number / 10 ) % 10) + (number % 100);
		
		System.out.println("The sum of the digits is " + sumOfDigits);

	}

}
