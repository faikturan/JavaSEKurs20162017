package com.faikturan;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample046 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a,b,c,d,e,f;
		ArrayList<String> kisiler = new ArrayList<>();
		ArrayList<String> yaslar = new ArrayList<>();
	   System.out.println("Birinci Ki�inin Ad�n� Giriniz.");
	   a=sc.nextLine();
	   System.out.println("Birinci Ki�inin Ya��n� Giriniz");
	   b=sc.nextLine();
	   System.out.println("�kinci Ki�inin Ad�n� Giriniz.");
	   c=sc.nextLine();
	   System.out.println("�kinci Ki�inin Ya��n� Giriniz.");
	   d=sc.nextLine();
	   System.out.println("���nc� Ki�inin Ad�n� Giriniz.");
	   e=sc.nextLine();
	   System.out.println("���nc� Ki�inin Ya��n� Giriniz.");
	   f=sc.nextLine();
	   kisiler.add(a);
	   kisiler.add(e);
	   kisiler.add(c);
	   yaslar.add(b);
	   yaslar.add(d);
	   yaslar.add(f);
	   System.out.println("S�ral� �simler");
	   for(int i =0; i < kisiler.size();i++){
		   System.out.println(kisiler.get(i));
	   }
	   System.out.println("S�ral� Ya�lar");
	   for(int j =0; j< yaslar.size();j++) {
		   System.out.println(yaslar.get(j));
	   }

	}

}
