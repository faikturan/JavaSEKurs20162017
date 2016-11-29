package com.faikturan;

import java.util.Scanner;

public class Sample023 {

	public static void main(String[] args) {
		// switch case Artýk Yýl Uygulamasý
		/*
		 * Girdiðiniz yýl ve ay deðerlerini göz öününe alarak ilgili ayýn kaç
		 * gün oldugunu bulunuz. 1-3-5-7-8-10-12->Gün Sayýsý: 31 
		 * 4-6-9-11->Günsayýsý: 30 
		 * Þubat Ayý 4 yýlda 1 : 29 Gün. yýlýn 4'e bölümünden kalan 0
		 * ve yýlýn 100'e bölümünden veya 400'e bölümünden kalan 0 deðilse gün
		 * sayýsý:29 bunun dýþýnda gün sayýsý:28
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
			System.out.println(ay + ". icin 31 gun vardýr");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(ay + ".icin 30 gun vardýr");
			break;
		case 2:
			if ((yil % 4 == 0) && ((yil % 100 != 0) || (yil % 400 == 0))) {
				System.out.println(ay + ".icin 29 gun vardýr");
			} else {
				System.out.println(ay + ".icin 28 gun vardýr");
			}
			break;
		default:
			System.out.println("Geçersiz bir ay girdiniz.");
			break;

		}
	}

}
