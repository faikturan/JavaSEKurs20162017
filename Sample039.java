package com.faikturan;

import java.util.Scanner;

public class Sample039 {

	public static void main(String[] args) {
		// Fibonacci serisi 
		System.out.println("L�tfen S�n�r Say�s� Giriniz:");
		Scanner s =  new Scanner(System.in);
		int sinirSayisi = s.nextInt();
		
		long[] seriler = new long[sinirSayisi];
		
		//Fibonacci serilerin ilk 2 eleman�
		seriler[0]= 0;
		seriler[1]= 1;
		
		//Fibonacci serilerini bulal�m
		for (int i = 2; i < sinirSayisi; i++) {
			seriler[i] = seriler[i-1] + seriler[i-2];
			
		}
		//Fibonacci seriler say�lar�n� yazd�ral�m
		System.out.println("Fibonacci seri s�n�r�: " +sinirSayisi);
		for (int i = 0; i < sinirSayisi; i++) {
			System.out.println(seriler[i] + " ");
		}

	}

}
