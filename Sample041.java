package com.faikturan;

import java.util.Scanner;

public class Sample041 {

	public static void main(String[] args) {
		// Klavyeden girilen say�lar� diziye aktarma
		
		int giris, kacAdet, Toplam = 0;
		Scanner sayiAl = new Scanner(System.in);
		
		System.out.println("Ka� Adet Say� gireceksiniz?");
		kacAdet = sayiAl.nextInt();
		int[] girilenSayi = new int[kacAdet];
		
		for(int x=0; x < girilenSayi.length; x++){
			System.out.println("Tam Say� Giriniz:");
			giris = sayiAl.nextInt();
			girilenSayi[x] = giris;
			Toplam = Toplam + girilenSayi[x];
		}
		
		for (int x = 0; x < girilenSayi.length; x++) {
			System.out.println("girilenSayi [" + x + "]=" +girilenSayi[x]);
		}

		System.out.println("Toplam�: " +Toplam);
		double ortalama = Toplam / girilenSayi.length;
		System.out.println("Ortalamas�: " +ortalama);
	}

}
