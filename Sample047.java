package com.faikturan;

import java.util.Scanner;

public class Sample047 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ka� ki�inin bilgisini girmek istiyorsunuz?");
		int sayi = s.nextInt();
		if (sayi < 1) {
			return;
		}
		int[] yas = new int[sayi];
		String [] isim = new String[sayi];
		for (int i = 0; i < sayi; i++) {
			System.out.println(i+1 + " . ki�inin ad�n� giriniz: ");
			isim[i] = s.next();
			System.out.println(i+1 + " . ki�inin ya��n� giriniz: ");
			yas[i] = s.nextInt();
		}
		
		System.out.println("----------------G�R�LEN DE�ERLER------------");
		for (int i = 0; i < sayi; i++) {
			System.out.println(i+1 + " . ki�inin ad�:" 
					+ isim[i] + ", ya��:  " +yas[i]);
		}

	}

}
