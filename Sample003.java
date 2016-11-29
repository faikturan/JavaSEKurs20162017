package com.faikturan;

public class Sample003 {

	public static void main(String[] args) {
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		/*int d���ndaki veritiplerine elle de�er atad���m�zda
		 * bunlar� cast etmemiz gerekir.*/
		System.out.println("byteSayi:"+byteSayi);
		System.out.println("ShortSayi:"+shortSayi);
		
		int intSayi = 32;
		long longSayi = 64L;
		System.out.println("intSayi:"+intSayi);
		System.out.println("longSayi:"+longSayi);
		/*long de�i�kene elle de�er atamak i�in sonuna L literalini
		 * eklememiz gerekir. AKsi halde derleyici 64 de�erini int olarak */
		
		int geciciInt = intSayi / 2;
		//geciciInt 16 olur inSayi de�i�meden 32 kal�r.
		System.out.println("geciciInt="+geciciInt);
		short geciciShort = (short) (shortSayi * 2);
		/* 
		 * geciciShort de�i�keninin de�eri 20 olur,
		 * byte ve short say�lara bir hesaplaman�n sonucunu atarken
		 * byte ve short de�erlere cast etmeyi unutmay�n�z.
		 */
		System.out.println("geciciShort= "+geciciShort);
		geciciInt = geciciInt + geciciShort;
		System.out.println("geciciInt Yeni De�er= "+geciciInt);//geciciInt 36 olur.
		
		float floatSayi = (float) 12.1; 
		float floatSayi2 = 12.1F;
		/*
		 * bir noktal� say� aksi belirtilmedi�i s�rece double
		 * kabul edilir. Bu nedenle elle de�er atanan say�n�n
		 * sonunda F kullan�labilir ya da (float) kullanarak say�
		 * float'a cast edilir.
		 */
		System.out.println("floatSayi="+floatSayi);
		System.out.println("floatSayi2="+floatSayi2); 
		
		double doubleSayi = 124.12;
		/*
		 * double say�lara elle atama yaparken herhangi bir casting i�lemine gerek yoktur.
		 */
		System.out.println("doubleSayi="+doubleSayi);
		
		char karakter = 'A';
		/* 
		 * bir karaktere elle atama yap�l�rken tekli t�rnak i�eretleri ('')
		 * i�erisinde oldu�undan emin olunuz.
		 */
		System.out.println("Karakter="+karakter);
		
		
	}

}
