package com.faikturan;

public class Sample026 {

	public static void main(String[] args) {
		// while - do while - for
		/*
		 * 1 ile 100 aras�nda yer alan 3 ve 5 ortak 
		 * katlar�n� continue ifadesiyle d�ng�lerle yapmak
		 */
		
		System.out.println("�� ve Be�in Ortak Katlar�:");
//		while (sayi <= 100) {
//			sayi++;
//			if (sayi%15 != 0) {
//				continue;
//			}
//			System.out.println(sayi);
		
//		do{
//			sayi++;
//			if (sayi%15 != 0) {
//			continue;
//			} 
//			System.out.println(sayi);
//		}while (sayi <= 100);
		
		for (int sayi = 2; sayi <= 100; sayi++) {
			if (sayi%15 != 0) {
				continue;
			}
			System.out.println(sayi);
		}
	}

}
