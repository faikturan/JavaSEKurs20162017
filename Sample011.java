package com.faikturan;

import java.util.Scanner;

public class Sample011 {

	public static void main(String[] args) {
		// Klavyeden int veri giri�i
		
		Scanner klavye = new Scanner(System.in);
		int birSayi;
		System.out.println("Bir Tamsay� de�eri giriniz:");
		birSayi = klavye.nextInt();
		System.out.println("Klavyeden girilen Tamsay� De�eri:" +birSayi);

	}

}
