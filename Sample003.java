package com.faikturan;

public class Sample003 {

	public static void main(String[] args) {
		byte byteSayi = (byte)6;
		short shortSayi = (short)10;
		/*int dýþýndaki veritiplerine elle deðer atadýðýmýzda
		 * bunlarý cast etmemiz gerekir.*/
		System.out.println("byteSayi:"+byteSayi);
		System.out.println("ShortSayi:"+shortSayi);
		
		int intSayi = 32;
		long longSayi = 64L;
		System.out.println("intSayi:"+intSayi);
		System.out.println("longSayi:"+longSayi);
		/*long deðiþkene elle deðer atamak için sonuna L literalini
		 * eklememiz gerekir. AKsi halde derleyici 64 deðerini int olarak */
		
		int geciciInt = intSayi / 2;
		//geciciInt 16 olur inSayi deðiþmeden 32 kalýr.
		System.out.println("geciciInt="+geciciInt);
		short geciciShort = (short) (shortSayi * 2);
		/* 
		 * geciciShort deðiþkeninin deðeri 20 olur,
		 * byte ve short sayýlara bir hesaplamanýn sonucunu atarken
		 * byte ve short deðerlere cast etmeyi unutmayýnýz.
		 */
		System.out.println("geciciShort= "+geciciShort);
		geciciInt = geciciInt + geciciShort;
		System.out.println("geciciInt Yeni Deðer= "+geciciInt);//geciciInt 36 olur.
		
		float floatSayi = (float) 12.1; 
		float floatSayi2 = 12.1F;
		/*
		 * bir noktalý sayý aksi belirtilmediði sürece double
		 * kabul edilir. Bu nedenle elle deðer atanan sayýnýn
		 * sonunda F kullanýlabilir ya da (float) kullanarak sayý
		 * float'a cast edilir.
		 */
		System.out.println("floatSayi="+floatSayi);
		System.out.println("floatSayi2="+floatSayi2); 
		
		double doubleSayi = 124.12;
		/*
		 * double sayýlara elle atama yaparken herhangi bir casting iþlemine gerek yoktur.
		 */
		System.out.println("doubleSayi="+doubleSayi);
		
		char karakter = 'A';
		/* 
		 * bir karaktere elle atama yapýlýrken tekli týrnak iþeretleri ('')
		 * içerisinde olduðundan emin olunuz.
		 */
		System.out.println("Karakter="+karakter);
		
		
	}

}
