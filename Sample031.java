package com.faikturan;

import java.util.Scanner;

public class Sample031 {

	public static void main(String[] args) {
		/*
		 * Klavyeden girilen sayýnýn karekökünü aldrýran
		 * ve 0 basýnca program çýkan program.
		 * do-while ile yapýlacak
		 */
		
//		Scanner s=new Scanner(System.in);
//		int sayi;
//		do {
//			System.out.println("Bir sayý giriniz");
//			sayi =s.nextInt();
//			double sonuc=Math.sqrt(sayi);
//			System.out.println(sonuc);
//			
//		} while (sayi!=0);
		
		double sayi = 0.0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Karekokunu almak istediðiniz sayýyý giriniz:");
			System.out.println("Programdan çýkmak için o deðerini giriniz.");
			sayi = s.nextDouble();
			double root = Math.sqrt(sayi);
			System.out.println("------------------");
			System.out.println("Girilen deðer: " +sayi);
			System.out.println("Karekökü: " +root);
		} while ((int)sayi != 0);
		
		System.out.println("Programdan çýkýlýyor....");

	}

}
