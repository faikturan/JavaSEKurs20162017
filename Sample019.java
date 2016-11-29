package com.faikturan;

import java.util.Scanner;

public class Sample019 {

	public static void main(String[] args) {
		/*
		 * 92 ve üzeri AA
		 * 85 ve üzeri BA
		 * 80 ve üzeri BB
		 * 75 ve üzeri CB
		 * 67 ve üzeri CC
		 * 58 ve üzeri DC
		 * 50 ve üzeri DD
		 * 50'nin altý FF
		 * notlar 0 ile 100 arasýnda if- else if -else kullanalým.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Sýnav notunuzu giriniz:");
		int sinavNotu = scan.nextInt();
		if (sinavNotu>100 || sinavNotu<0) {
			System.out.println("Lütfen 0-100 aralýðýnda not giriniz.");
		}
		else if ( sinavNotu>=92){
			System.out.println("Notunuz: AA");
		}
		else if ( sinavNotu>=85){
			System.out.println("Notunuz: BA");
		}
		else if ( sinavNotu>=80){
			System.out.println("Notunuz: BB");
		}
		else if ( sinavNotu>=75){
			System.out.println("Notunuz: CB");
		}
		else if ( sinavNotu>=67){
			System.out.println("Notunuz: CC");
		}
		else if ( sinavNotu>=58){
			System.out.println("Notunuz: DC");
		}
		else if ( sinavNotu>=50){
			System.out.println("Notunuz: DD");
		}else{
			System.out.println("Notunuz: FF");
		}
		}

	}


