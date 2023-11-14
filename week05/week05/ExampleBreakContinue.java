package week05;

public class ExampleBreakContinue {

	public static void main(String[] args) {
		withBreak();
		withContinue();
	}

	static void withBreak() {
		final int MAX = 5;
		int a = 0;
		while (true) {
			if (a > MAX) {
				System.out.println("break");
				break;
			} else {
				System.out.println(a);
			}
			a++;
		}
	}

	static void withContinue() {
		final int MAX = 5;
		int sum = 0;
		for (int i = 0; i < MAX; i++) {
			if (i % 2 == 0) {
				System.out.println("even");
				sum += i;
			} else {
				System.out.println("odd");
				continue;
			}
			System.out.println("i:" + i + " sum:" + sum);
		}
	}

}
