package com.faikturan;

public class Sample043 {

	public static void main(String[] args) {
		// Dizinin elemanlarýna yeni deðerlar atayan metot yazalým.
		int[] ornekDizi = {34, 52, 73, 93, 111};
		DiziDeger(ornekDizi);
		for (int i = 0; i < ornekDizi.length; i++) {
			System.out.println(ornekDizi[i] + " ");
		}

	}

	private static void DiziDeger(int[] ornekDizi) {
		ornekDizi[1] = 1865;
		ornekDizi[4] = 32;
		
	}

}
