package week05;

public class ExampleTriangleLowerLeft {

	static final int SIZE = 10;

	public static void main(String[] args) {
		System.out.println("before call lowerLeft");
		lowerLeft();
		System.out.println("after call lowerLeft");
	}

	static void lowerLeft() {
		System.out.println("start: lowerLeft");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println("end: lowerLeft");
	}

}
