package com.faikturan;

import java.util.Scanner;

public class Sample015 {

	public static void main(String[] args) {
		// if, if-else, else if, switch
		/*
		 * programda karar verme durumlar�nda kullan�l�r.
		 */

		//if
		//if(ko�ul){//yap�lacak i�ler}
//		//region deneme
//		String adi = "ali";
//		if(adi == "ali"){
//			System.out.println("Ali Ad� Bulundu.");
//			System.out.println("Yap�lacak farkl� i�ler");
//		}else{
//			System.out.println("Aranan �sim Bulunamad�");
//		}
//		System.out.println("Ben her t�rl� �al���r�m.");
//		
//		//endregion
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("L�tfen Ya��n�z� Giriniz:");
//		String yasi = oku.nextLine();
//		if (yasi.equals("10")) {
//			System.out.println("Sen �ocuksun");
//		}
//		
//		if (yasi.equals("20")) {
//			System.out.println("Sen Gen�sin");
//		}
//		
//		if (yasi.equals("30")) {
//			System.out.println("Sen Yeti�kinsin");
//		}
//		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("L�tfen G�n Giriniz:");
//		String gun = oku.nextLine();
//		switch (gun) {
//		case "pazartesi":
//			// yap�lacak i�ler
//			System.out.println("G�n Bulundu Pazartesi");
//			break;
//		case "sal�":
//			System.out.println("G�n Bulundu Sal�");
//			break;
//		case "�ar�amba":
//			System.out.println("G�n Bulundu �ar�amba");
//			break;
//		default:
//			System.out.println("G�n Bulunamad�. Hata!!!");
//			break;
//		}
		
		
		
//		//if(ko�ul) ko�ul == boolean
//		String bolum = "muh";
//		String sinif = "3";
//		if (bolum.equals("muh")&& sinif.equals("3")) {
//			//muh dal�nda ve 3. s�n�fta olan ��renciler
//		}
//		
//		if (bolum.equals("muh") || sinif.equals("3")) {
//			//muh dal�nda veya 3. s�n�fta olan ��renciler
//		}
//		
		
//		Scanner klavye = new Scanner(System.in);
//		int birSayi;
//		System.out.println("Bir Tamsay� giriniz:");
//		birSayi = klavye.nextInt();
//		if ((birSayi !=0) && (birSayi %2 ==0)) {
//			System.out.println("Girdi�iniz Say� �ift Say�d�r.");
//		}
//		
//		if (birSayi %2 == 1) {
//			System.out.println("Girdi�iniz Say� Tek Say�d�r.");
//		}
		
		//kullan�c�dan 2 de�er al�nacak
		//ya��
		//s�n�f
		
		//kurallar:
		//ya�� 18 den b�y�k ise 3,4 s�n�fa ba�vurabilir
		//ya�� 18 den k���k ise 1,2 s�n�fa ba�vurabilir
		
		//17 3->RED
		//15 2->KABUL
		//32 4->KABUL
		
		
Scanner giris = new Scanner(System.in);
int yas, sinif;

System.out.println("lutfen yasinizi girin");
yas = giris.nextInt();
System.out.println("lutfen sinifinizi girin");
sinif = giris.nextInt();

if ( (yas>18) && ( (sinif == 3) || (sinif ==4)) ) {
	
	System.out.println("kayit basarili");
}
if ( (yas<18) && ( (sinif == 1) || (sinif ==2)) ) {
	System.out.println("kayit basarili");
}
else {
	System.out.println("kayit red");
	
}
}

		
		
		
		
		
		
		
		
		
	}
