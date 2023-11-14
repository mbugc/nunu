package week03;

/* 
 * Make sure that you use debugger 
 * so that you can trace the value changes
 */
public class ConstantsVariablesV0 {

	public static void main(String[] args) {

		// *** variables ***
		//
		// define variables
		int a;
		int b;
		//
		// assign values to variables
		a = 1; // initialize its value
		System.out.println("a-1:" + a);
		b = 2; // initialize its value
		a = 3; // change the value
		//
		a = b; // copy the value of `b`; put it in `a`
		b = 4; // value of `a` is not effected by this
		System.out.println("a-2:" + a);

		//
		// define and initialize in one line
		int radius = 8;

		// non-Latin letters in identifiers
		int αβΓ = 9;
		System.out.println("αβΓ + 1:" + (αβΓ + 1));

//		//
//		// exchange values of `a` and `b`
//		System.out.println(">a:" + a + "b:" + b);
//		int tmp;
//		tmp = a;
//		a = b;
//		b = tmp;
//		System.out.println("<a:" + a + "b:" + b);
//
//		// *** constant ***
//		final int HOURS_IN_DAY = 24;
////		HOURS_IN_DAY = 8; // you cannot change constant once it is defined
//
//		// *** variables and constants ***
//		a = HOURS_IN_DAY;
////		HOURS_IN_DAY = a; // you cannot change constant once it is defined

		// *** arithmetic ***
//		final int SECONDS_IN_MINUTE = 60;
//
//		a = 6 + 7 * 3;
//		a = b + 7;
//		a = b + SECONDS_IN_MINUTE;
//		b = a + radius;
//
//		final int SECONDS_IN_MINUTE = 60;
//		int timeInSeconds = 63;
//		int minute = timeInSeconds / SECONDS_IN_MINUTE;
//		int second = timeInSeconds % SECONDS_IN_MINUTE;
//		System.out.println("There are " //
//				+ minute + " minutes and " //
//				+ second + " seconds" //
//				+ " in " + timeInSeconds + " seconds.");
//
//		//
//		// strange operations (not like Math)
//		System.out.println(">a = a + 1:" + a);
//		a = a + 1;
//		System.out.println("<a = a + 1:" + a);
//
//		//
//		System.out.println(">a += 3:" + a);
//		a += 3; // a <= a + 3
//		System.out.println("<a += 3:" + a);
//
//		//
//		System.out.println(">a++:" + a);
//		a++;
//		System.out.println("<a++:" + a);
//
//		//
//		a = 10;
//		System.out.println("####a++:" + a + " " + a++ + " " + a);
//
//		//
//		a = 10;
//		System.out.println("####++a:" + a + " " + ++a + " " + a);
//
//		//
//		a = 10;
//		System.out.println("####a--:" + a + " " + a-- + " " + a);
//
//		//
//		a = 10;
//		System.out.println("####--a:" + a + " " + --a + " " + a);
//
//		// integer division
//		System.out.println(">b = 1 / 2:" + b);
//		b = 1 / 2; // result is 0 due to integer division
//		System.out.println("<b = 1 / 2:" + b);
//
//		// problem with double and float
//		System.out.println(1.0 - 0.1 - .1 - .1 - .1 - .1 - .1 + " but expected 0.4.");
//		double d6 = 0.1 - .1 - .1 - .1 - .1 - .1;
//		System.out.println(1.0 - d6);
//		
//		// questions
//		System.out.println((8--));

	}

}
