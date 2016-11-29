package com.faikturan;

import java.util.Scanner;

public class Sample014 {

	public static void main(String[] args) {
		// Kullanýcýdan veri alýmý
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Adýnýzý Giriniz:");
		String adi = sc.next();
		System.out.println("Lütfen Soyadýnýzý Giriniz:");
		String soyadi = sc.nextLine();
		
		String yaz = "Adý: " + adi + " " + "Soyadý: " +soyadi;
		System.out.println(yaz);

	}

}
