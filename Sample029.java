package com.faikturan;

import java.util.Scanner;

public class Sample029 {

	public static void main(String[] args) {
		// Bizim belirledi�imiz limit de�erine kadar
		/*
		 * for d�ng�s� ile tek ve �ift say�lar� 
		 * ekrana yazd�ran program
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("L�tfen limit de�erini giriniz:");
		int limit = s.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			//Tek say�lar
			if (i % 2 != 0) {
				System.out.println(i+ " Tek Say�d�r.");
			}
		}
		
		for (int i = 0; i <= limit; i++) {
			if (i % 2 == 0) {
				System.out.println(i+ " �ift Say�d�r.");
			}
		}

		
	}

}
