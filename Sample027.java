package com.faikturan;

import java.util.Scanner;

public class Sample027 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bu program kullan�c�n�n girdi�i"
				+ "say�ya kadar olan t�m do�al say�lar�n karelerini g�sterir.");
		System.out.println("Kare alma i�lemini sonland�rmak"
				+ "istedi�iniz say�y� giriniz.");
		int sayi = s.nextInt();
		int sayac = 0;
		int toplam = 0;
		while (sayac <= sayi) {
			System.out.println(sayac + " say�n�n karesi = " +sayac*sayac);
			toplam +=sayac*sayac;
			System.out.println(toplam);
			sayac++;
		}

	}

}
