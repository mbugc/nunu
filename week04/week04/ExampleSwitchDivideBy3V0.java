package week04;

public class ExampleSwitchDivideBy3V0 {

	public static void main(String[] args) {

		final int THREE = 3;
		int remainder;
		
		int number;
		
		// test cases
		number = 0;
//		number = 1;
//		number = 2;
//		number = 17;
		
		remainder = number % THREE;
		
		
		switch (remainder) {
		case 0: {
			System.out.println(number + " is divisible by 3");
			break;
		}
		case 1: {
			System.out.println("1 is the remainder when " + number + " is divided by 3");
			break;
		}
		case 2: {
			System.out.println("2 is the remainder when " + number + " is divided by 3");
			break;
		}
		default:
			System.out.println("** WARNING ** If you get this far, you have an error");
		}
		
	}

}
