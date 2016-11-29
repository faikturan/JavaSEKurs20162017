package com.faikturan;

import java.io.IOException;

public class Sample034 {

	public static void main(String[] args) throws IOException {
		// Klavyeden Deger Alma Karar Kontrol Yap�lar� ve D�ng�ler
		char secilen;
		do {
			System.out.println("Ana Men�ye Ho�geldiniz:");
			System.out.println("	1. G�ncel");
			System.out.println("	2. Havale Yap");
			System.out.println("	3. Kont�r G�nder");
			System.out.println("	4. Hesap A�");
			System.out.println("	5. Limitleri G�r\n");
			System.out.println("L�tfen bir men� se�iniz : ");
			secilen = (char) System.in.read();
		} while (secilen < '1' || secilen > '5');

		System.out.println("\n");
		switch (secilen) {
		case '1':
			System.out.println("G�ncel men�s� se�ildi.\n");
			break;
		case '2':
			System.out.println("Havale Yap men�s� se�ildi.\n");
			break;
		case '3':
			System.out.println("Kont�r G�nder men�s� se�ildi.\n");
			break;
		case '4':
			System.out.println("Hesap A� men�s� se�ildi.");
			break;
		case '5':
			System.out.println("Limitleri G�ster men�s� se�ildi.");
			break;
		}
	}

}
