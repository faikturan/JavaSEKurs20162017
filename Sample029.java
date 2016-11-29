package com.faikturan;

import java.util.Scanner;

public class Sample029 {

	public static void main(String[] args) {
		// Bizim belirlediðimiz limit deðerine kadar
		/*
		 * for döngüsü ile tek ve çift sayýlarý 
		 * ekrana yazdýran program
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Lütfen limit deðerini giriniz:");
		int limit = s.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			//Tek sayýlar
			if (i % 2 != 0) {
				System.out.println(i+ " Tek Sayýdýr.");
			}
		}
		
		for (int i = 0; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i+ " Çift Sayýdýr.");
			}
		}

		
	}

}
