package week04;

import java.util.Scanner;

public class ReadConsoleByScannerV0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// read an integer
		System.out.println("Enter an integer such as '12':");
		int a = in.nextInt();
		System.out.println("You entered integer:" + a);
		//
		in.close();
	}

}
