package com.faikturan;

import java.io.IOException;

public class Sample034 {

	public static void main(String[] args) throws IOException {
		// Klavyeden Deger Alma Karar Kontrol Yapýlarý ve Döngüler
		char secilen;
		do {
			System.out.println("Ana Menüye Hoþgeldiniz:");
			System.out.println("	1. Güncel");
			System.out.println("	2. Havale Yap");
			System.out.println("	3. Kontör Gönder");
			System.out.println("	4. Hesap Aç");
			System.out.println("	5. Limitleri Gör\n");
			System.out.println("Lütfen bir menü seçiniz : ");
			secilen = (char) System.in.read();
		} while (secilen < '1' || secilen > '5');

		System.out.println("\n");
		switch (secilen) {
		case '1':
			System.out.println("Güncel menüsü seçildi.\n");
			break;
		case '2':
			System.out.println("Havale Yap menüsü seçildi.\n");
			break;
		case '3':
			System.out.println("Kontör Gönder menüsü seçildi.\n");
			break;
		case '4':
			System.out.println("Hesap Aç menüsü seçildi.");
			break;
		case '5':
			System.out.println("Limitleri Göster menüsü seçildi.");
			break;
		}
	}

}
