package com.faikturan;

import java.util.Scanner;

public class Sample032 {

	public static void main(String[] args) {
		// Klavyeden üç kenarýnýn uzunluðu girilen üçgenin
		//ne çeþit bir üçgen olduðunu ekrana yazdýrýnýz.
		//ikizkenar, eþkenar, çeþitkenar 
		//if-else ve switch-case beraber kullanýlacak
//		Scanner s=new Scanner(System.in);
//		System.out.println("üçgenin 1.kenar uzunluðunu giriniz: ");
//		int a= s.nextInt();
//		System.out.println("üçgenin 2.kenar uzunluðunu giriniz: ");
//		int b= s.nextInt();
//		System.out.println("üçgenin 3.kenar uzunluðunu giriniz: ");
//		int c= s.nextInt();
//		if(a==b && b==c){
//			System.out.println("bu üçgen eþkenardýr.");
//		}
//		else if((a==b && b!=c) ||(b==c && a!=c) ||(a==c && b!=c)){
//			System.out.println("bu üçgen ikizkenardýr.");
//		}
//			else{
//				System.out.println("bu üçgen çeþitkenardýr.");
//			}
		
		int a, b, c, ucg;
		Scanner s = new Scanner(System.in);
		System.out.println("a deðerini giriniz:");
		a =s.nextInt();
		System.out.println("b deðerini giriniz:");
		b =s.nextInt();
		System.out.println("c deðerini giriniz:");
		c =s.nextInt();
		if(a == b){
			if(a == c) ucg = 3;
			else ucg = 2;
		}else{
			if(a==c) ucg =2;
			else
			{
				if(b==c)ucg=2;
				else ucg=1;
			}
			
		}
		switch (ucg) {
		case 1: System.out.println("Çeþitkenar Üçgen");break;
		case 2: System.out.println("Ýkizkenar Üçgen");break;
		case 3: System.out.println("Eþkenar Üçgen");break;
		}
		
		}


	}


