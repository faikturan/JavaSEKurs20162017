package com.faikturan;

import java.util.Scanner;

public class Sample030 {

	public static void main(String[] args) {
		// Bizim belirledi�imiz limit de�erine kadar
		/*
		 * for d�ng�s� ile 
		 * asal say�lar� ekrana yazd�ran program
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("L�tfen limit de�erini giriniz:");
		int limit = s.nextInt();
		
		//1.for d�ng�s�
		for (int i = 2; i < limit; i++) {
			boolean durum = true;
			
			//2.for d�ng�s�
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					durum = false;
					break;
				}
			}
			//denetle ve yazd�r
			if(durum){
				System.out.println(i + " ");
			}
		}

	}

}
