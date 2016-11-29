package com.faikturan;

import java.util.Scanner;

public class Sample030 {

	public static void main(String[] args) {
		// Bizim belirlediðimiz limit deðerine kadar
		/*
		 * for döngüsü ile 
		 * asal sayýlarý ekrana yazdýran program
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Lütfen limit deðerini giriniz:");
		int limit = s.nextInt();
		
		//1.for döngüsü
		for (int i = 2; i < limit; i++) {
			boolean durum = true;
			
			//2.for döngüsü
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					durum = false;
					break;
				}
			}
			//denetle ve yazdýr
			if(durum){
				System.out.println(i + " ");
			}
		}

	}

}
