package week06;

public class ExampleStringManipulations {

	public static void main(String[] args) {

		// initialize
		String stringA = "MyName";
		/**/System.out.println("stringA:" + stringA);

		/// length
		int length = stringA.length();
		/**/System.out.println("length:" + length);

		// convert integer to String
		int number = 78;
		String stringB;
		stringB = "" + number;
		stringB = String.valueOf(number);
		/**/System.out.println("stringB:" + stringB);

		// string concatenation
		String stringC = "ccc";
		String stringD = "ddd";
		String stringE = stringC + stringD;
		/**/System.out.println("stringC:" + stringC//
				+ "\tstringD:" + stringD//
				+ "\tstringE:" + stringE);

		// equality check
		String stringF = "Red";
		String stringG = "R" + "e" + "d";
		System.out.println("stringG:" + stringG);
		if (stringF.equals(stringF)) {
			System.out.println(stringF + " is equal to " + stringG);
		} else {
			System.out.println(stringF + " is not equal to " + stringG);
		}

		//
		String stringH = "yellow";
		System.out.println("stringH:" + stringH);
		System.out.println("stringH.charAt(4):" + stringH.charAt(4));
		System.out.println("stringH.substring(1):" + stringH.substring(1));
	}

}
