package com.faikturan;

import java.util.Scanner;

public class Sample012 {

	public static void main(String[] args) {
		// K�sa ve Uzun Kenar� Klavyeden Girilen Dikd�rtgenin Alan� ve �evresi:
		Scanner giris = new Scanner(System.in);
		double kisaKenar, uzunKenar, alan, cevre;
		System.out.println("L�tfen K�sa Kenar Uzunlu�u Giriniz:");
		kisaKenar = giris.nextDouble();
		System.out.println("L�tfen Uzun Kenar Uzunlu�u Giriniz:");
		uzunKenar = giris.nextDouble();
		alan = kisaKenar * uzunKenar;
		cevre = 2 * (kisaKenar + uzunKenar);
		System.out.println("Alan: " +alan);
		System.out.println("�evre: " +cevre);
		

	}

}
