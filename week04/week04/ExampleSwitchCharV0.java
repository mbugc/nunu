package week04;

public class ExampleSwitchCharV0 {

	public static void main(String[] args) {

		char c;

		// test cases
//		c = 'a';
//		c = 'e';
//		c = 'i';
//		c = 'o';
//		c = 'u';
//		c = 'b';
		c = 'c';
//		c = 'k';

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			// vowels: a, e, i, o, and u.
			System.out.println("Letter " + c + " is a vowel.");
			break;

		default:
			// others
			System.out.println("Letter " + c + " is a consonant.");
			break;
		}
	}

}
