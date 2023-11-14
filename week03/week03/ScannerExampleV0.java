package week03;

import java.util.Scanner;

public class ScannerExampleV0 {

	public static void main(String[] args) {
		// read in the number of circles.
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int readInt = scanner.nextInt();
		System.out.println("readInt:" + readInt);
		
		// release resource
		scanner.close();
	}

}
