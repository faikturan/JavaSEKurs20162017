package com.faikturan;

public class Sample042 {

	public static void main(String[] args) {
//		// Dizilerin Metotlara Atanmas�
//		
//		//dizimizi tan�mlad�k
//		int[] ornekDizi = {6, 0, 0, 6, 6, 8};
//		//4.s�radaki eleman� istedik.
//		metotDizi(ornekDizi[3]);

		//Diziyi tamamen alan bir metot yazal�m
		int[] ornekDizi = {3, 5, 7, 9, 11};
		metotDizi(ornekDizi);
	}

	private static void metotDizi(int[] ornekDizi) {
//		System.out.println(deger);
		for (int i = 0; i < ornekDizi.length; i++) {
			System.out.println(ornekDizi[i] + " ");
			
		}
		
	}

}
