package com.faikturan;

import java.util.Scanner;

public class Sample022 {

	public static void main(String[] args) {
		int gun;
		System.out.println("L�tfen g�n de�erini say� olarak (1-7) aral���nda giriniz.");
		Scanner s = new Scanner(System.in);
		gun = s.nextInt();
		switch (gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta i�i");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Girilen de�er ge�ersiz.");
			break;
		}
	}

}
