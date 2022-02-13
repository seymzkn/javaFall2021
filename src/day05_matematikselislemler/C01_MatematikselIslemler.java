package day05_matematikselislemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {
		
		System.out.println(4*(2+5)/2); //14
		
		
		System.out.println(4*(2+5)/3); //9 28/3 iki sayida tamsayi nt oldugu icin virgullu sonucu kabul etmez
		
		//sonucu virgullu yazdirmak istersek
		
		double sonuc=4*(2+5)/3;
		
		
		System.out.println(sonuc); //9.0 yukaridaki islem sonucunu java 9 bulur sonra da double a atar. bu yuzden sonuc 9.0 dir.
		
		sonuc=(double)4*(2+5)/3;
		
		System.out.println(sonuc); //9.333333333333334
		
		
		
		
		
		

	}

}
