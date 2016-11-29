package com.faikturan;

import java.util.Scanner;

public class Sample041 {

	public static void main(String[] args) {
		// Klavyeden girilen sayýlarý diziye aktarma
		
		int giris, kacAdet, Toplam = 0;
		Scanner sayiAl = new Scanner(System.in);
		
		System.out.println("Kaç Adet Sayý gireceksiniz?");
		kacAdet = sayiAl.nextInt();
		int[] girilenSayi = new int[kacAdet];
		
		for(int x=0; x < girilenSayi.length; x++){
			System.out.println("Tam Sayý Giriniz:");
			giris = sayiAl.nextInt();
			girilenSayi[x] = giris;
			Toplam = Toplam + girilenSayi[x];
		}
		
		for (int x = 0; x < girilenSayi.length; x++) {
			System.out.println("girilenSayi [" + x + "]=" +girilenSayi[x]);
		}

		System.out.println("Toplamý: " +Toplam);
		double ortalama = Toplam / girilenSayi.length;
		System.out.println("Ortalamasý: " +ortalama);
	}

}
