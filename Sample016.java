package com.faikturan;

import java.util.Random;
import java.util.Scanner;

public class Sample016 {

	public static void main(String[] args) {
		Random random = new Random();
		double bakiye = (double)random.nextInt(2000);
		double cekilecek = 0;
		System.out.println("Þu anki bakiyeniz: " +bakiye);
		System.out.println("Lütfen çekmek istediðiniz miktari giriniz:");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek <= bakiye) {
			bakiye = bakiye - cekilecek;
			System.out.println("Çekilen Para Miktarý: " +cekilecek);
			System.out.println("Kalan Para Miktarý: " +bakiye);
		}else{
			System.out.println("Hesabýnýzda yeterli bakiye yok!!!");
		}
		

	}

}
