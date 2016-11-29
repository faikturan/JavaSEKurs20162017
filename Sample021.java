package com.faikturan;

import java.util.Scanner;

public class Sample021 {

	public static void main(String[] args) {
		// switch case Kullanýmý
		Scanner s = new Scanner(System.in);
		System.out.println("Doðum Ayýnýzý Giriniz:");
		int dogdugunuzAy = s.nextInt();
		String dogumAyi = " ";
		switch (dogdugunuzAy) {
		case 1:
			dogumAyi = "Ocak";
			break;
		case 2:
			dogumAyi = "Þubat";
			break;
		case 3:
			dogumAyi = "Mart";
			break;
		default:
			System.out.println("Geçersiz bir Ay girdiniz.");
			break;
		}
		System.out.println("Doðduðunuz Ay: " +dogumAyi);
	}

}
