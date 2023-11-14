package week04;

import java.util.Scanner;

public class Ch03_ComputeAndInterpretBMI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter age
		System.out.print("Enter your name: ");
		String name = input.next();
		
		// Prompt the user to enter age
		System.out.print("Enter your age: ");
		int age = input.nextInt();

		// Prompt the user to enter weight in kilograms
		System.out.print("Enter weight in kilograms: ");
		double weight = input.nextDouble();

		// Prompt the user to enter height in meters
		System.out.print("Enter height in meters: ");
		double height = input.nextDouble();
		
		Ch03_BMI bmiClass = new Ch03_BMI(name, age, weight, height);
		System.out.println(bmiClass.getStatus());

	}

}