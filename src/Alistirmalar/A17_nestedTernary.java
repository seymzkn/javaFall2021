package Alistirmalar;

import java.util.Scanner;

public class A17_nestedTernary {

	public static void main(String[] args) {
		//Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//Calisan erkekse 65 yasindan buyukse emekli olabilir
		
		
		//her seferinde scanner olusturmak yerine
		//test datalarimizi variable olarak da olusturabiliriz
		//ve kod yazimi bittiginde bu test datalarini degistirerek
		//kodlarimizi test edebiliriz 
		
		char cinsiyet='K';
		int yas=61;
		
		String sonuc = cinsiyet=='K' ? (yas>=60 ? "Emekli olabilirsin" : "Emekli olamazsin"):
										(yas>=65 ? "Emekli olabilirsin" : "Emekli olamazsin");
										
										System.out.println(sonuc);
	}

}
