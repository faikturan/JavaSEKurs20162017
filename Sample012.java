package com.faikturan;

import java.util.Scanner;

public class Sample012 {

	public static void main(String[] args) {
		// Kýsa ve Uzun Kenarý Klavyeden Girilen Dikdörtgenin Alaný ve Çevresi:
		Scanner giris = new Scanner(System.in);
		double kisaKenar, uzunKenar, alan, cevre;
		System.out.println("Lütfen Kýsa Kenar Uzunluðu Giriniz:");
		kisaKenar = giris.nextDouble();
		System.out.println("Lütfen Uzun Kenar Uzunluðu Giriniz:");
		uzunKenar = giris.nextDouble();
		alan = kisaKenar * uzunKenar;
		cevre = 2 * (kisaKenar + uzunKenar);
		System.out.println("Alan: " +alan);
		System.out.println("Çevre: " +cevre);
		

	}

}
