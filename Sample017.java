package com.faikturan;

import java.util.Random;
import java.util.Scanner;

public class Sample017 {

	public static void main(String[] args) {
		Random random = new Random();
		double bakiye = (double)random.nextInt(2000);
		double cekilecek = 0;
		double limit = 500;//Bir i�lemde maksimum �ebilecek miktar
		System.out.println("�u anki bakiyeniz: " +bakiye);
		System.out.println("L�tfen �ekmek istedi�iniz miktari giriniz:");
		Scanner s = new Scanner(System.in);
		cekilecek = s.nextDouble();
		if (cekilecek <= bakiye && cekilecek <= limit) {
			bakiye = bakiye - cekilecek;
			System.out.println("�ekilen Para Miktar�: " +cekilecek);
			System.out.println("Kalan Para Miktar�: " +bakiye);
		}else{
			System.out.println("Hesab�n�zda yeterli bakiye yok\n" +
					"veya �ekmek istedi�iniz miktar i�lem limitinizden fazla");
		}

	}

}
