package com.faikturan;

import java.util.Scanner;

public class Sample047 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Kaç kiþinin bilgisini girmek istiyorsunuz?");
		int sayi = s.nextInt();
		if (sayi < 1) {
			return;
		}
		int[] yas = new int[sayi];
		String [] isim = new String[sayi];
		for (int i = 0; i < sayi; i++) {
			System.out.println(i+1 + " . kiþinin adýný giriniz: ");
			isim[i] = s.next();
			System.out.println(i+1 + " . kiþinin yaþýný giriniz: ");
			yas[i] = s.nextInt();
		}
		
		System.out.println("----------------GÝRÝLEN DEÐERLER------------");
		for (int i = 0; i < sayi; i++) {
			System.out.println(i+1 + " . kiþinin adý:" 
					+ isim[i] + ", yaþý:  " +yas[i]);
		}

	}

}
