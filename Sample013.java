package com.faikturan;

import java.util.Scanner;

public class Sample013 {

	public static void main(String[] args) {
		// Yarýçap Uzunluðu Klavyeden Girilen Çemberin Çevresi Alaný
		final double pi = 3.14;
		double r, alan, cevre;
		Scanner giris = new Scanner(System.in);
		
		System.out.println("Lütfen Yarýçap Uzunluðu Giriniz:");
		r = giris.nextDouble();
		cevre = 2 * pi * r;
		alan = pi * Math.pow(r, 2);
		System.out.printf("Çemberin alani %f cevresi ise %f", alan,cevre);
		
		

	}

}
