package com.faikturan;

import java.util.Scanner;

public class Sample014 {

	public static void main(String[] args) {
		// Kullan�c�dan veri al�m�
		Scanner sc = new Scanner(System.in);
		System.out.println("L�tfen Ad�n�z� Giriniz:");
		String adi = sc.next();
		System.out.println("L�tfen Soyad�n�z� Giriniz:");
		String soyadi = sc.nextLine();
		
		String yaz = "Ad�: " + adi + " " + "Soyad�: " +soyadi;
		System.out.println(yaz);

	}

}
