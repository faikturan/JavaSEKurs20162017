package com.faikturan;

import java.util.Scanner;

public class Sample019 {

	public static void main(String[] args) {
		/*
		 * 92 ve �zeri AA
		 * 85 ve �zeri BA
		 * 80 ve �zeri BB
		 * 75 ve �zeri CB
		 * 67 ve �zeri CC
		 * 58 ve �zeri DC
		 * 50 ve �zeri DD
		 * 50'nin alt� FF
		 * notlar 0 ile 100 aras�nda if- else if -else kullanal�m.
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("S�nav notunuzu giriniz:");
		int sinavNotu = scan.nextInt();
		if (sinavNotu>100 || sinavNotu<0) {
			System.out.println("L�tfen 0-100 aral���nda not giriniz.");
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


