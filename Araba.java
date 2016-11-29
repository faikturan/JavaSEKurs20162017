package com.faikturan;

public class Araba {
	final static int enYuksekHiz = 180;
	public int simdikiHiz;
	final static int enDusukHiz = 0;
	final static int enYuksekVites = 5;
	public int simdikiVites;
	final static int enDusukVites = 1;
	public boolean calisiyor;
	public String model;
	
	public Araba() {
		calisiyor = false;
		simdikiHiz = 0;
		simdikiVites = 1;
	}

	public Araba(int baslangicHizi, int baslangicVitesi, boolean baslangicDurumu) {
		simdikiHiz = baslangicHizi;
		simdikiVites = baslangicVitesi;
		calisiyor = baslangicDurumu;
	}
	
	public void kontakCevir(){
		if (calisiyor==true) {
			calisiyor = false;
		}else{
			calisiyor = true;
		}
	}
	
	public void gazaBas(int artisMiktari){
		if (calisiyor==true) {
			if((simdikiHiz + artisMiktari) > enYuksekHiz){
				simdikiHiz = enYuksekHiz;
			}else{
				simdikiHiz = simdikiHiz + artisMiktari;
			}
		}
	}

	public void frenYap(int azalisMiktari){
		if (calisiyor==true) {
			if((simdikiHiz - azalisMiktari) > enDusukHiz){
				simdikiHiz = simdikiHiz - azalisMiktari;
			}else{
				simdikiHiz = enDusukHiz;
			}
		}
	}
	
	public void vitesArtir(){
		if (calisiyor==true) {
			if (simdikiVites < enYuksekVites) {
				simdikiVites++;
			}
		}
	}
	
	public void vitesAzalt(){
		if (calisiyor==true) {
			if (simdikiVites > enDusukVites) {
				simdikiVites--;
			}	
		}
	}
	
	public void durumYazdir(){
		System.out.println("Çalýþýyor: " +calisiyor + " Þimdiki Hýz: " +simdikiHiz + "  Þimdiki Vites: " +simdikiVites+
				"	Arabanýn Modeli: " +model);
	}
	
	

}
