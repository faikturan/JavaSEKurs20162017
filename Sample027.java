package com.faikturan;

import java.util.Scanner;

public class Sample027 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bu program kullanýcýnýn girdiði"
				+ "sayýya kadar olan tüm doðal sayýlarýn karelerini gösterir.");
		System.out.println("Kare alma iþlemini sonlandýrmak"
				+ "istediðiniz sayýyý giriniz.");
		int sayi = s.nextInt();
		int sayac = 0;
		int toplam = 0;
		while (sayac <= sayi) {
			System.out.println(sayac + " sayýnýn karesi = " +sayac*sayac);
			toplam +=sayac*sayac;
			System.out.println(toplam);
			sayac++;
		}

	}

}
