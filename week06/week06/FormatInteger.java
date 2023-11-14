package week06;

public class FormatInteger {

	public static int format(int number, int width) {
		
		String s = "" + number; // "34"
		
		int originalWidth = s.length(); //2
		int result = Math.max(originalWidth, width); //4
	
		while (s.length() < width) {
			s = "0" + s; // 1. loopta 034, 2. loopta 0034
			
		}
	
		System.out.println(s);
		
		return result;
		
	}

	public static int formatWithThousands(int number) {
		
		// Zor yöntem
		/**
		String s = "" + number; // 100,000,000
		
		int result = 0;
		for(int i=s.length(); i>3; i=i-3) {
			result++; // ilk tur i= 7->4 result 1, ikinci tur i=4->1 result 2, üçüncü tur yok i 2den büyük değil
		}
		**/
		
		// Kolay yöntem
		int artik = number; // 100,000,000
		int i;
		for(i = 0; artik > 1000; i++) {
			artik = number / 1000;
		}
		
		return i;
	}

}
