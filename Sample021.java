package com.faikturan;

import java.util.Scanner;

public class Sample021 {

	public static void main(String[] args) {
		// switch case Kullan�m�
		Scanner s = new Scanner(System.in);
		System.out.println("Do�um Ay�n�z� Giriniz:");
		int dogdugunuzAy = s.nextInt();
		String dogumAyi = " ";
		switch (dogdugunuzAy) {
		case 1:
			dogumAyi = "Ocak";
			break;
		case 2:
			dogumAyi = "�ubat";
			break;
		case 3:
			dogumAyi = "Mart";
			break;
		default:
			System.out.println("Ge�ersiz bir Ay girdiniz.");
			break;
		}
		System.out.println("Do�du�unuz Ay: " +dogumAyi);
	}

}
