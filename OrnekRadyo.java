package com.faikturan;

public class OrnekRadyo {

	public static void main(String[] args) {
		Radyo sony = new Radyo();
		sony.durumYazdir();
		sony.acKapat();
		sony.sesAc(150);
		sony.frekansDegistir(102.5);
		sony.sesKis(20);
		sony.durumYazdir();

	
		Radyo philips = new Radyo(40, 80.3, true);
		philips.durumYazdir();
		philips.acKapat();
		philips.frekansDegistir(92.3);
		philips.sesKis(12);
		philips.sesKis(5);
		philips.durumYazdir();
		
		Radyo kumtel = new Radyo(80);
		kumtel.durumYazdir();
		kumtel.frekansDegistir(103.8);
		kumtel.sesAc(50);
		kumtel.sesKis(10);
		kumtel.durumYazdir();
	}

}
