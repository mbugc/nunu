package week03;

public class ForLoopsV0 {

	public static void main(String[] args) {

//		for (int i = 0; // initialize loop variable
//				i < 5; // test for limit
//				i++ // increment loop variable
//				) {
//			// body
//			System.out.println("value of i:" + i);
//		}

		final int SIZE = 10;
		//
		System.out.println("assending");
		for (int i = 0; i < SIZE; i++) {
			System.out.println(i);
		}
		//
		System.out.println("decending");
		for (int i = SIZE - 1; i >= 0; i--) {
			System.out.println(i);
		}

		// table of x and x squared
		System.out.println("table of x and x squared");
		System.out.println("i" + "\t" + "i^2");
		System.out.println("__" + "\t" + "__");
		for (int i = 0; i < SIZE; i++) {
			System.out.println(i + "\t" + i * i);
		}

	}

}
