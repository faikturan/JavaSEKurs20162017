package com.faikturan;

import java.util.Scanner;

public class Sample025 {

	public static void main(String[] args) {
		int sayi, basamak, toplam =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bir Sayý giriniz:");
		sayi = s.nextInt();
		
		while (sayi > 0) {
			basamak = sayi%10;
			toplam += basamak;
			sayi = sayi/10;
		}
		System.out.println(toplam);

	}

}
