package com.faikturan;

import java.util.Scanner;

public class Sample032 {

	public static void main(String[] args) {
		// Klavyeden �� kenar�n�n uzunlu�u girilen ��genin
		//ne �e�it bir ��gen oldu�unu ekrana yazd�r�n�z.
		//ikizkenar, e�kenar, �e�itkenar 
		//if-else ve switch-case beraber kullan�lacak
//		Scanner s=new Scanner(System.in);
//		System.out.println("��genin 1.kenar uzunlu�unu giriniz: ");
//		int a= s.nextInt();
//		System.out.println("��genin 2.kenar uzunlu�unu giriniz: ");
//		int b= s.nextInt();
//		System.out.println("��genin 3.kenar uzunlu�unu giriniz: ");
//		int c= s.nextInt();
//		if(a==b && b==c){
//			System.out.println("bu ��gen e�kenard�r.");
//		}
//		else if((a==b && b!=c) ||(b==c && a!=c) ||(a==c && b!=c)){
//			System.out.println("bu ��gen ikizkenard�r.");
//		}
//			else{
//				System.out.println("bu ��gen �e�itkenard�r.");
//			}
		
		int a, b, c, ucg;
		Scanner s = new Scanner(System.in);
		System.out.println("a de�erini giriniz:");
		a =s.nextInt();
		System.out.println("b de�erini giriniz:");
		b =s.nextInt();
		System.out.println("c de�erini giriniz:");
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
		case 1: System.out.println("�e�itkenar ��gen");break;
		case 2: System.out.println("�kizkenar ��gen");break;
		case 3: System.out.println("E�kenar ��gen");break;
		}
		
		}


	}


