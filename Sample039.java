package com.faikturan;

import java.util.Scanner;

public class Sample039 {

	public static void main(String[] args) {
		// Fibonacci serisi 
		System.out.println("Lütfen Sýnýr Sayýsý Giriniz:");
		Scanner s =  new Scanner(System.in);
		int sinirSayisi = s.nextInt();
		
		long[] seriler = new long[sinirSayisi];
		
		//Fibonacci serilerin ilk 2 elemaný
		seriler[0]= 0;
		seriler[1]= 1;
		
		//Fibonacci serilerini bulalým
		for (int i = 2; i < sinirSayisi; i++) {
			seriler[i] = seriler[i-1] + seriler[i-2];
			
		}
		//Fibonacci seriler sayýlarýný yazdýralým
		System.out.println("Fibonacci seri sýnýrý: " +sinirSayisi);
		for (int i = 0; i < sinirSayisi; i++) {
			System.out.println(seriler[i] + " ");
		}

	}

}
