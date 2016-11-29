package com.faikturan;

import java.util.ArrayList;

public class Sample045 {

	public static void main(String[] args) {
		/*
		 * ArrayList Sýnýfý
		 * Baþlangýç boyutu belli olmayan dizilere dinamik diziler denir.
		 * Dinamik dizileri ArrayList sýnýfý ile oluþtururuz. Bu sýnýfý kullanabilmek 
		 * için import iþlemini yapmanýz gerekir.
		 * 
		 * add(); listenin sonuna eleman ekler.
		 * remove(indis); verilen indisteki elemaný siler.
		 * clear(); dizideki tüm elemanlarý siler.
		 * indexOf(); dizi elemanlarý arasýnda arama yapmak için. Eleman bulunursa indisini
		 * döndürür bulunamazsa -1 döndürür.
		 * size(); dizideki eleman sayýsýný verir.
		 * get(indis); aranan indis numarasýna Object tipinde döndürür.
		 */
		
		ArrayList<String> dizi = new ArrayList<String>();
		
		dizi.add("Ýsmek");
		dizi.add("Yenibosna");
		dizi.add("Java");
		dizi.add("Okulu");
		dizi.add(2, "Biliþim");
		
		System.out.println("Boyutu: " +dizi.size());
		for (int i = 0; i < dizi.size(); i++) {
			System.out.println(i + " . eleman: " +dizi.get(i));
		}
		
		dizi.remove(0);
		
		System.out.println("\n" + "Silme iþleminden sonra: " + dizi.size());
		for (int i = 0; i < dizi.size(); i++) {
			System.out.println(i + " . eleman: " +dizi.get(i));
		}
	}

}
