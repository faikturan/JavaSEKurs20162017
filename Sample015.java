package com.faikturan;

import java.util.Scanner;

public class Sample015 {

	public static void main(String[] args) {
		// if, if-else, else if, switch
		/*
		 * programda karar verme durumlarýnda kullanýlýr.
		 */

		//if
		//if(koþul){//yapýlacak iþler}
//		//region deneme
//		String adi = "ali";
//		if(adi == "ali"){
//			System.out.println("Ali Adý Bulundu.");
//			System.out.println("Yapýlacak farklý iþler");
//		}else{
//			System.out.println("Aranan Ýsim Bulunamadý");
//		}
//		System.out.println("Ben her türlü çalýþýrým.");
//		
//		//endregion
		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("Lütfen Yaþýnýzý Giriniz:");
//		String yasi = oku.nextLine();
//		if (yasi.equals("10")) {
//			System.out.println("Sen Çocuksun");
//		}
//		
//		if (yasi.equals("20")) {
//			System.out.println("Sen Gençsin");
//		}
//		
//		if (yasi.equals("30")) {
//			System.out.println("Sen Yetiþkinsin");
//		}
//		
//		Scanner oku = new Scanner(System.in);
//		System.out.println("Lütfen Gün Giriniz:");
//		String gun = oku.nextLine();
//		switch (gun) {
//		case "pazartesi":
//			// yapýlacak iþler
//			System.out.println("Gün Bulundu Pazartesi");
//			break;
//		case "salý":
//			System.out.println("Gün Bulundu Salý");
//			break;
//		case "çarþamba":
//			System.out.println("Gün Bulundu Çarþamba");
//			break;
//		default:
//			System.out.println("Gün Bulunamadý. Hata!!!");
//			break;
//		}
		
		
		
//		//if(koþul) koþul == boolean
//		String bolum = "muh";
//		String sinif = "3";
//		if (bolum.equals("muh")&& sinif.equals("3")) {
//			//muh dalýnda ve 3. sýnýfta olan öðrenciler
//		}
//		
//		if (bolum.equals("muh") || sinif.equals("3")) {
//			//muh dalýnda veya 3. sýnýfta olan öðrenciler
//		}
//		
		
//		Scanner klavye = new Scanner(System.in);
//		int birSayi;
//		System.out.println("Bir Tamsayý giriniz:");
//		birSayi = klavye.nextInt();
//		if ((birSayi !=0) && (birSayi %2 ==0)) {
//			System.out.println("Girdiðiniz Sayý Çift Sayýdýr.");
//		}
//		
//		if (birSayi %2 == 1) {
//			System.out.println("Girdiðiniz Sayý Tek Sayýdýr.");
//		}
		
		//kullanýcýdan 2 deðer alýnacak
		//yaþý
		//sýnýf
		
		//kurallar:
		//yaþý 18 den büyük ise 3,4 sýnýfa baþvurabilir
		//yaþý 18 den küçük ise 1,2 sýnýfa baþvurabilir
		
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
