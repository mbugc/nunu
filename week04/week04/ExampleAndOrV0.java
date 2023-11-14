package week04;

public class ExampleAndOrV0 {

	public static void main(String[] args) {

		int x;
		boolean b;

		// always evaluate both sides
		x = 1;
		b = (1 < x) & (x++ < 10);
		System.out.println("(1 < x) & (x++ < 10)" + "\tx:" + x + "\t\tb:" + b);

		// evaluating the left is enough since it is false.
		// therefore `(x++ < 10)` is never get evaluated
		x = 1;
		b = (1 < x) && (x++ < 10);
		System.out.println("(1 < x) && (x++ < 10)" + "\tx:" + x + "\t\tb:" + b);

		// always evaluate both sides
		x = 1;
		b = (1 == x) | (x++ < 10);
		System.out.println("(1 == x) | (x++ < 10)" + "\tx:" + x + "\t\tb:" + b);

		// evaluating the left is enough since it is true
		x = 1;
		b = (1 == x) || (x++ < 10);
		System.out.println("(1 == x) || (x++ < 10)" + "\tx:" + x + "\t\tb:" + b);

	}

}
