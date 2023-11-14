package week05;

public class DiamondV0 {

	static final int SIZE = 5;

	public static void main(String[] args) {
		
		for (int i = SIZE-1; i >= 0; i--) {
			for (int j = 0; j < SIZE*2-1; j++) {
				if (i-1 < j && j < SIZE*2 - i-1) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i < SIZE; i++) {
			for (int j = 0; j < SIZE*2-1; j++) {
				if (i-1 < j && j < SIZE*2 - i-1) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}

}
