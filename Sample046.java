package com.faikturan;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample046 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a,b,c,d,e,f;
		ArrayList<String> kisiler = new ArrayList<>();
		ArrayList<String> yaslar = new ArrayList<>();
	   System.out.println("Birinci Kiþinin Adýný Giriniz.");
	   a=sc.nextLine();
	   System.out.println("Birinci Kiþinin Yaþýný Giriniz");
	   b=sc.nextLine();
	   System.out.println("Ýkinci Kiþinin Adýný Giriniz.");
	   c=sc.nextLine();
	   System.out.println("Ýkinci Kiþinin Yaþýný Giriniz.");
	   d=sc.nextLine();
	   System.out.println("Üçüncü Kiþinin Adýný Giriniz.");
	   e=sc.nextLine();
	   System.out.println("Üçüncü Kiþinin Yaþýný Giriniz.");
	   f=sc.nextLine();
	   kisiler.add(a);
	   kisiler.add(e);
	   kisiler.add(c);
	   yaslar.add(b);
	   yaslar.add(d);
	   yaslar.add(f);
	   System.out.println("Sýralý Ýsimler");
	   for(int i =0; i < kisiler.size();i++){
		   System.out.println(kisiler.get(i));
	   }
	   System.out.println("Sýralý Yaþlar");
	   for(int j =0; j< yaslar.size();j++) {
		   System.out.println(yaslar.get(j));
	   }

	}

}
