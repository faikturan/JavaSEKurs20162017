package com.faikturan;

import java.util.Scanner;

public class Sample023 {

	public static void main(String[] args) {
		// switch case Art�k Y�l Uygulamas�
		/*
		 * Girdi�iniz y�l ve ay de�erlerini g�z ��n�ne alarak ilgili ay�n ka�
		 * g�n oldugunu bulunuz. 1-3-5-7-8-10-12->G�n Say�s�: 31 
		 * 4-6-9-11->G�nsay�s�: 30 
		 * �ubat Ay� 4 y�lda 1 : 29 G�n. y�l�n 4'e b�l�m�nden kalan 0
		 * ve y�l�n 100'e b�l�m�nden veya 400'e b�l�m�nden kalan 0 de�ilse g�n
		 * say�s�:29 bunun d���nda g�n say�s�:28
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Yili giriniz: (sayisal olarak)");
		int yil = input.nextInt();
		System.out.println("ayi giriniz");
		int ay = input.nextInt();
		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(ay + ". icin 31 gun vard�r");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(ay + ".icin 30 gun vard�r");
			break;
		case 2:
			if ((yil % 4 == 0) && ((yil % 100 != 0) || (yil % 400 == 0))) {
				System.out.println(ay + ".icin 29 gun vard�r");
			} else {
				System.out.println(ay + ".icin 28 gun vard�r");
			}
			break;
		default:
			System.out.println("Ge�ersiz bir ay girdiniz.");
			break;

		}
	}

}
