package com.faikturan;

public class OrnekAraba {

	public static void main(String[] args) {
	
		Araba renault = new Araba();
		renault.kontakCevir();
		renault.gazaBas(20);
		renault.vitesArtir();
		renault.model="Renault";
		renault.durumYazdir();
	
		Araba toyota = new Araba(50, 3, true);
		toyota.gazaBas(50);
		toyota.vitesArtir();
		toyota.vitesArtir();
		toyota.model="Toyota";
		toyota.durumYazdir();
		
		

	}

}
