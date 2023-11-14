package week06;

public class FormatInteger_Test {

	public static void main(String[] args) {
		formatTest();
		formatWithThousandsTest();
	}

	private static void formatTest() {
		int number;
		int width;
		int solution;

		System.out.println("\n\ntesting--formatTest");
		//
		System.out.println("\n--------");
		number = 34;
		width = 4;
		solution = 4;
		zeroPadding(number, width, solution);
		//
		System.out.println("\n--------");
		number = 34;
		width = 5;
		solution = 5;
		zeroPadding(number, width, solution);
		//
		System.out.println("\n--------");
		number = 34;
		width = 1;
		solution = 2;
		zeroPadding(number, width, solution);
		//
		System.out.println("\n--------");
		number = 0;
		width = 4;
		solution = 4;
		zeroPadding(number, width, solution);
	}

	private static void zeroPadding(int number, int width, int solution) {
		int calculated;
		calculated = FormatInteger.format(number, width);
		if (solution == calculated) {
			System.out.println("correct"//
					+ "\tnumber:" + number + "\twidth:" + width//
					+ "\tsolution:" + solution + "\tcalculated:" + calculated);
		} else {
			System.err.println("wrong" //
					+ "\tnumber:" + number + "\twidth:" + width//
					+ "\tsolution:" + solution + "\tcalculated:" + calculated);
		}
	}

	private static void formatWithThousandsTest() {
		int number;
		int solution;

		System.out.println("\n\ntesting--formatWithThousandsTest");

		//
		System.out.println("\n--------");
		number = 0;
		solution = 0;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 999;
		solution = 0;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 1234;
		solution = 1;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 2007;
		solution = 1;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 102057;
		solution = 1;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 3102057;
		solution = 2;
		thousands(number, solution);
		//
		System.out.println("\n--------");
		number = 000007;
		solution = 0;
		thousands(number, solution);
	}

	private static void thousands(int number, int solution) {
		int calculated;
		calculated = FormatInteger.formatWithThousands(number);
		if (solution == calculated) {
			System.out.println("correct"//
					+ "\tnumber:" + number//
					+ "\tsolution:" + solution + "\tcalculated:" + calculated);
		} else {
			System.err.println("wrong"//
					+ "\tnumber:" + number//
					+ "\tsolution:" + solution + "\tcalculated:" + calculated);
		}
	}

}
