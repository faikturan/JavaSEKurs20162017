package com.faikturan;

public class Sample040 {

	public static void main(String[] args) {
		// define an array
		int[] sayilar = new int[]{1453, 1299, 571, 632, 1923};
		int toplam = 0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam = toplam + sayilar[i];
			//toplam +=sayilar[i];
			
			//ortalama hesabý
			double ortalama = toplam / sayilar.length;
			
			System.out.println("Sonuç: " +ortalama);
		}

	}

}
