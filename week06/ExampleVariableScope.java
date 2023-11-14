package week06;

public class ExampleVariableScope {

	public static void main(String[] args) {
		twoDeclaredCorrect();
		twoDeclaredInForLoopCorrect();
		twoDeclaredNestedForLoopCorrect();
	}

	public static void twoDeclaredCorrect() {
		int i = 0;
		System.out.println("i:" + i);
		int j = 1;
		System.out.println("j:" + j);
	}

//	public static void twoDeclaredIncorrect() {
//		int i = 0;
//		System.out.println("i:" + i);
//		int i = 1;
//		System.out.println("i:" + i);
//	}

	public static void twoDeclaredInForLoopCorrect() {
		// correct: int i is declared twice in for-loops
		//
		for (int i = 1; i < 10; i++) {
			System.out.println("i:" + i);
		}
//		i++ // error
		//
		for (int i = 1; i < 10; i++) {
			System.out.println("squared:" + (i * i));
		}
	}

	public static void twoDeclaredNestedForLoopCorrect() {
		for (int i = 1; i < 10; i++) {
			System.out.println("i:" + i);
			for (int j = 1; j < 10; j++) {
				System.out.println("squared:" + (j * j));
			}		
		}
	}


//	public static void twoDeclaredNestedForLoopIncorrect() {
//		for (int i = 1; i < 10; i++) {
//			System.out.println("i:" + i);
//			for (int i = 1; i < 10; i++) {
//				System.out.println("i^2:" + (i * i));
//			}
//		}
//	}

}
