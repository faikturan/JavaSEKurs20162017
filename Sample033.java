package com.faikturan;

import java.util.Random;
import java.util.Scanner;

public class Sample033 {

	public static void main(String[] args) {
		int sayac=1;
		Random rnd=new Random();
		int x=rnd.nextInt(10);
		Scanner s=new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		int sayi=s.nextInt();
		do {
			if (sayi>x) {
				System.out.println("Daha k���k bir say� giriniz:");
				sayi=s.nextInt();
				sayac++;
			} else {
				System.out.println("Daha b�y�k bir say� giriniz:");
				sayi=s.nextInt();
				sayac++;

			}
		} while (sayi!=x);
		System.out.println(+sayac +". ad�mda say�y� buldunuz.");

	}

}
