package com.faikturan;

import java.util.Scanner;

public class Sample013 {

	public static void main(String[] args) {
		// Yar��ap Uzunlu�u Klavyeden Girilen �emberin �evresi Alan�
		final double pi = 3.14;
		double r, alan, cevre;
		Scanner giris = new Scanner(System.in);
		
		System.out.println("L�tfen Yar��ap Uzunlu�u Giriniz:");
		r = giris.nextDouble();
		cevre = 2 * pi * r;
		alan = pi * Math.pow(r, 2);
		System.out.printf("�emberin alani %f cevresi ise %f", alan,cevre);
		
		

	}

}
