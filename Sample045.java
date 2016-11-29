package com.faikturan;

import java.util.ArrayList;

public class Sample045 {

	public static void main(String[] args) {
		/*
		 * ArrayList S�n�f�
		 * Ba�lang�� boyutu belli olmayan dizilere dinamik diziler denir.
		 * Dinamik dizileri ArrayList s�n�f� ile olu�tururuz. Bu s�n�f� kullanabilmek 
		 * i�in import i�lemini yapman�z gerekir.
		 * 
		 * add(); listenin sonuna eleman ekler.
		 * remove(indis); verilen indisteki eleman� siler.
		 * clear(); dizideki t�m elemanlar� siler.
		 * indexOf(); dizi elemanlar� aras�nda arama yapmak i�in. Eleman bulunursa indisini
		 * d�nd�r�r bulunamazsa -1 d�nd�r�r.
		 * size(); dizideki eleman say�s�n� verir.
		 * get(indis); aranan indis numaras�na Object tipinde d�nd�r�r.
		 */
		
		ArrayList<String> dizi = new ArrayList<String>();
		
		dizi.add("�smek");
		dizi.add("Yenibosna");
		dizi.add("Java");
		dizi.add("Okulu");
		dizi.add(2, "Bili�im");
		
		System.out.println("Boyutu: " +dizi.size());
		for (int i = 0; i < dizi.size(); i++) {
			System.out.println(i + " . eleman: " +dizi.get(i));
		}
		
		dizi.remove(0);
		
		System.out.println("\n" + "Silme i�leminden sonra: " + dizi.size());
		for (int i = 0; i < dizi.size(); i++) {
			System.out.println(i + " . eleman: " +dizi.get(i));
		}
	}

}
