package com.faikturan;

public class Sample002 {

	public static void main(String[] args) {
		// Deðiþkenler
		//String - Karakter katar
		//Default deðeri : null
		
		String adi = "Ali";
		String yasi = "30";
		String maasi = "3.500";
		System.out.println("Adý: " +adi + " Yaþý: " +yasi + " Maaþý: " +maasi);
		
		
		//Tam sayý veri türleri
		//default deðeri : 0
		int say1 = 10;
		int say2 = 20;
		int toplam = say1 + say2;
		System.out.println("Sonuç: " +toplam);
		
		//Ondalýklý sayýsal birim
		//Double virgülden en fazla 16 haneye kadar deðer
		//8 byte
		double ondalikli1 = 15.6;
		double ondalikli2 = 3.9;
		double sonuc = ondalikli1 -ondalikli2;
		System.out.println("Ondalýklý Sonucu: " +sonuc);
		
		//float veri türü
		//virglden sonra en fazla 8 haneye kadar deðer
		//4 byte
		float f1 =  (float) 10.5;
		float f2 = 10.5f;
		float f3 = f1 * f2;
		System.out.println("Sonuç: " +f3);
		
		//char veri türü
		//içerisine sadece 1 karakter alýr
		char c1 = 'Ý';
		char c2 = 'S';
		char c3 = 'M';
		char c4 = 'E';
		char c5 = 'K';
		System.out.println(""+c1+c2+c3+c4+c5);
		
		
		
		
		
		
		
		
		

	}

}
