package com.faikturan;

public class KlasikRadyo implements Radyo {
	final static int enYuksekSesDuzeyi = 120;
	public int simdikiSesDuzeyi;
	final static int enDusukSesDuzeyi = 0;
	final static double enYuksekFrekans = 108.0;
	public double simdikiFrekans;
	final static double enDusukFrekans = 87.5;
	public boolean acik;
	
	public KlasikRadyo() {
		acik = false;
		simdikiSesDuzeyi = 80;
		simdikiFrekans = 99.5;
	}
	
	public KlasikRadyo(boolean baslangicDurumu, 
			int baslangicSesDuzeyi, double baslangicFrekansi) {
		simdikiSesDuzeyi = baslangicSesDuzeyi;
		simdikiFrekans = baslangicFrekansi;
		acik = baslangicDurumu;
	}

	public KlasikRadyo(int baslangicSesDuzey) {
		acik = true;
		simdikiSesDuzeyi = baslangicSesDuzey;
		simdikiFrekans = 99.5;
	}

	public void acKapat(){
		if (acik== true) {
			acik = false;
		}else{
			acik = true;
		}
	}
	
	public void sesAc(int acmaMiktari){
		if (acik==true) {
			if ((simdikiSesDuzeyi + acmaMiktari) > enYuksekSesDuzeyi) {
				simdikiSesDuzeyi = enYuksekSesDuzeyi;
			}else{
				simdikiSesDuzeyi = simdikiSesDuzeyi + acmaMiktari;
			}
		}
	}
	
	public void sesKis(int kismaMiktari){
		if (acik==true) {
			if ((simdikiSesDuzeyi - kismaMiktari) < enDusukSesDuzeyi) {
				simdikiSesDuzeyi = enDusukSesDuzeyi;
			}else{
				simdikiSesDuzeyi = simdikiSesDuzeyi - kismaMiktari;
			}
		}
	}
	
	public void frekansDegistir(double yeniFrekans){
		if(acik==true){
			if((enDusukFrekans <= yeniFrekans) && (yeniFrekans <= enYuksekFrekans)){
				simdikiFrekans = yeniFrekans;
			}
		}
	}
	
	public void durumYazdir(){
		System.out.println("Açýk: " +acik + "  Şimdiki Ses Düzeyi: " +simdikiSesDuzeyi + " Şimdiki Frekans: " +simdikiFrekans);
	}
	

}