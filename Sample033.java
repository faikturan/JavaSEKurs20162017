package com.faikturan;

import java.util.Random;
import java.util.Scanner;

public class Sample033 {

	public static void main(String[] args) {
		int sayac=1;
		Random rnd=new Random();
		int x=rnd.nextInt(10);
		Scanner s=new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int sayi=s.nextInt();
		do {
			if (sayi>x) {
				System.out.println("Daha küçük bir sayý giriniz:");
				sayi=s.nextInt();
				sayac++;
			} else {
				System.out.println("Daha büyük bir sayý giriniz:");
				sayi=s.nextInt();
				sayac++;

			}
		} while (sayi!=x);
		System.out.println(+sayac +". adýmda sayýyý buldunuz.");

	}

}
