package com.faikturan;

import java.util.Scanner;

public class Sample022 {

	public static void main(String[] args) {
		int gun;
		System.out.println("Lütfen gün deðerini sayý olarak (1-7) aralýðýnda giriniz.");
		Scanner s = new Scanner(System.in);
		gun = s.nextInt();
		switch (gun) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Hafta içi");
			break;
		case 6:
		case 7:
			System.out.println("Hafta Sonu");
			break;
		default:
			System.out.println("Girilen deðer geçersiz.");
			break;
		}
	}

}
