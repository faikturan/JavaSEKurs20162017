package com.faikturan;

import java.util.Scanner;

public class Sample031 {

	public static void main(String[] args) {
		/*
		 * Klavyeden girilen say�n�n karek�k�n� aldr�ran
		 * ve 0 bas�nca program ��kan program.
		 * do-while ile yap�lacak
		 */
		
//		Scanner s=new Scanner(System.in);
//		int sayi;
//		do {
//			System.out.println("Bir say� giriniz");
//			sayi =s.nextInt();
//			double sonuc=Math.sqrt(sayi);
//			System.out.println(sonuc);
//			
//		} while (sayi!=0);
		
		double sayi = 0.0;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Karekokunu almak istedi�iniz say�y� giriniz:");
			System.out.println("Programdan ��kmak i�in o de�erini giriniz.");
			sayi = s.nextDouble();
			double root = Math.sqrt(sayi);
			System.out.println("------------------");
			System.out.println("Girilen de�er: " +sayi);
			System.out.println("Karek�k�: " +root);
		} while ((int)sayi != 0);
		
		System.out.println("Programdan ��k�l�yor....");

	}

}
