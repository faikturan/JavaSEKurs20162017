package com.faikturan;

public class Sample004 {

	public static void main(String[] args) {
		// T�r d�n���mleri
		/*
		 * uygun olmas� durumunda de�i�ken t�r�n�n de�i�tirilmesi durumudur.
		 */
		String say1 = "30";
		int dyas = Integer.valueOf(say1);
		int carp = dyas * 3;
		System.out.println("�arp Sonucu:"+carp);
		
		String say2 = "15.6";
		double d1 = Double.valueOf(say2);
		System.out.println("Double Sonucu: "+ (d1 + 10.5));
		
		//ilket t�rlerin kendi aralar�nda t�r d�n���m�
		float f1 = 10.9f;
		float f2 = 15.8f;
		int topla = (int) (f1 + f2);
		System.out.println("Float Sonucu: " +topla);
		
		char c = '9';
		int dc = (int)c;
		System.out.println("Int Sonucu: " +dc);
		int gdc = Integer.valueOf(String.valueOf(c));
		System.out.println("Ger�ek D�n���m: " +gdc);
		
		
		
		
		

	}

}
