package com.faikturan;

import java.util.Scanner;

public class Sample020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		double birsayi,secim;
		System.out.println("F'� C'ye �evirmek i�in 1, "
				+ "C'yi F'ye �evirmek i�in 2'yi tu�lay�n");
		secim=a.nextDouble();
		System.out.println("�evirmek istedi�iniz say�y� giriniz");
		birsayi=a.nextDouble();
		
		if(secim==1)
		{
			double C=(birsayi-32)*5/9;
			System.out.println(birsayi+"F "+C+ "C'ye e�ittir.");
		}
		if(secim==2)
		{
			double F=(birsayi*9)/5+32;
			System.out.println(birsayi+"C "+F+ "F'ye e�ittir.");
		}
		

	}

}
