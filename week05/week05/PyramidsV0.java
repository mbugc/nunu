package week05;

public class PyramidsV0 {
	
	static final int SIZE = 10;

	public static void main(String[] args) {
		lowerLeft();
		lowerRight();
		upperLeft();
		upperRight();
	}

	static void lowerLeft() {
		System.out.println("\nstart: lowerLeft");
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

	static void lowerRight() {
		System.out.println("\nstart: lowerRight");
		for (int i = 0; i < SIZE; i++) {
			for (int j = SIZE-1; j >= 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println("end: lowerRight");
	}
	static void upperLeft() {
		System.out.println("\nstart: upperLeft");
		for (int i = SIZE-1; i >= 0; i--) {
			for (int j = 0; j < SIZE; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println("end: upperLeft");
	}
	static void upperRight() {
		System.out.println("\nstart: upperRight");
		for (int i = SIZE-1; i >= 0; i--) {
			for (int j = SIZE-1; j >= 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println("end: upperRight");
	}

}
