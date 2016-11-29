package com.faikturan;

public class Sample007 {

	public static void main(String[] args) {
		int birinciSayi = 4;
		int ikinciSayi = 8;
		int ucuncuSayi = 12;
		int sonuc;
		
		sonuc = (birinciSayi + ikinciSayi) * ucuncuSayi;
		System.out.println("Parantez Kullanýldýðýnda Sonuc: " +sonuc);
		
		sonuc = birinciSayi + ikinciSayi * ucuncuSayi;
		System.out.println("Parantez Kullanýlmadýðýnda Sonuc: " +sonuc);

	}

}
