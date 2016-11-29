package com.faikturan;

import java.util.Arrays;

public class Sample044 {

	public static void main(String[] args) {
		// Dizilerin Kopyalanmasý
		
		//for döngüsü kullanarak
//		int[] diziCopy1 = {7, 6, 0, 0, 6};
//		int[] diziCopy2 = new int[diziCopy1.length];
//		
//		for (int a = 0; a < diziCopy1.length; a++) {
//			diziCopy2[a] = diziCopy1[a];
//		}
//		
//		for (int k = 0; k < diziCopy2.length; k++) {
//			System.out.print(diziCopy2[k] + "\t");
//		}
		
		//ArrayCopy metodu
		int[] diziCopy1 = {7, 6, 0, 0, 6};
		int[] diziCopy2 = new int[diziCopy1.length];
		
		System.arraycopy(diziCopy1, 0, diziCopy2, 0, 5);
		//birinci dizinin ilk elemaný dizi2'nin ilk elemanýndan baþlamak üzere
		//dizi1'in 5 elemaný dizi 2'ye kopyalacaktýr.
		//eksik sayý girersek geri kalan deðerleri 0 yapar.
		
		for (int k = 0; k < diziCopy1.length; k++) {
			System.out.print(diziCopy2[k] + "\t");
		}
		

	}

}
