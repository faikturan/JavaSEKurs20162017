package com.faikturan;

import java.util.ArrayList;

public class Sample024 {

	public static void main(String[] args) {
		ArrayList<String> aylarListesi = new ArrayList<String>();
		int ay = 1;
		switch (ay) {
		case 1: aylarListesi.add("Ocak");
		case 2: aylarListesi.add("Þubat");
		case 3: aylarListesi.add("Mart");
		case 4: aylarListesi.add("Nisan");
		case 5: aylarListesi.add("Mayýs");
		case 6: aylarListesi.add("Haziran");
		case 7: aylarListesi.add("Temmuz");
		case 8: aylarListesi.add("Aðustos");
		case 9: aylarListesi.add("Eylül");
		case 10: aylarListesi.add("Ekim");
		case 11: aylarListesi.add("Kasým");
		case 12: aylarListesi.add("Aralýk");
			break;
		default:
			System.out.println("------------Geçersiz bir ay girdiniz----------");
			break;
		}
		if (aylarListesi.isEmpty()) {
			System.out.println("Geçersiz bir ay girdiniz.");
		} else {
			//Özelleþmiþ for dongüsü//for(String ayAdi : aylarListesi){
			//System.out.println(ayAdi);
				//}
			for (int i =0; i < aylarListesi.size();i++) {
				System.out.println(aylarListesi.get(i));
			}
		}
	}

}
