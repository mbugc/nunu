package week06;

public class Ch06_RandomNumberGeneration {

	static final int UNICODE_MIN = 0;
	static final int UNICODE_MAX = 65535;

	public static void main(String[] args) {

//		for (int i = 0; i < 1e7; i++) {
//			int r = randomUnicode();
//			if (r > UNICODE_MAX) {
//				System.err.println(">UNICODE_MAX");
//			}
//		}
//		System.out.println("done");

		//
		for (int i = 0; i < 100; i++) {
			char c = randomChar();
			System.out.println("c:" + c);
		}
	}

	private static int randomUnicode() {
		return (int) (Math.random() * (UNICODE_MAX + 1));
	}

	private static char randomChar() {
//		int iChar = ('a' + Math.random() * ('z' - 'a' + 1));
		int iChar = (int) ((int) 'a' + Math.random() * ((int) 'z' - (int) 'a' + 1));
		return (char) iChar;
	}
}
