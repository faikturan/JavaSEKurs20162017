package com.faikturan;

public class Sample002 {

	public static void main(String[] args) {
		// De�i�kenler
		//String - Karakter katar
		//Default de�eri : null
		
		String adi = "Ali";
		String yasi = "30";
		String maasi = "3.500";
		System.out.println("Ad�: " +adi + " Ya��: " +yasi + " Maa��: " +maasi);
		
		
		//Tam say� veri t�rleri
		//default de�eri : 0
		int say1 = 10;
		int say2 = 20;
		int toplam = say1 + say2;
		System.out.println("Sonu�: " +toplam);
		
		//Ondal�kl� say�sal birim
		//Double virg�lden en fazla 16 haneye kadar de�er
		//8 byte
		double ondalikli1 = 15.6;
		double ondalikli2 = 3.9;
		double sonuc = ondalikli1 -ondalikli2;
		System.out.println("Ondal�kl� Sonucu: " +sonuc);
		
		//float veri t�r�
		//virglden sonra en fazla 8 haneye kadar de�er
		//4 byte
		float f1 =  (float) 10.5;
		float f2 = 10.5f;
		float f3 = f1 * f2;
		System.out.println("Sonu�: " +f3);
		
		//char veri t�r�
		//i�erisine sadece 1 karakter al�r
		char c1 = '�';
		char c2 = 'S';
		char c3 = 'M';
		char c4 = 'E';
		char c5 = 'K';
		System.out.println(""+c1+c2+c3+c4+c5);
		
		
		
		
		
		
		
		
		

	}

}
