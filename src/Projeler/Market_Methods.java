package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Market_Methods {

	static double ort;
	public static double getOrtalamaKazanc() {

		double toplam=0;
	
		for (int i = 0; i < 7; i++) {
			toplam+=Market.gunlukKazanclar.get(i);	
		}
		ort=toplam/7;
			return ort;
		
	}
	
	public static  void getOrtalamaninUstundeKazancGünleri() {
		for (int i = 0; i < 7; i++) {
			if(Market.gunlukKazanclar.get(i)>ort) {
					System.out.println("Ortlamanin ustundeki kazanc gunleri: "+ Market.gunler.get(i));
			}
		}
		
	}
	public static  void getOrtalamaninAltindaKazancGünleri() {
		for (int i = 0; i < 7; i++) {
			if(Market.gunlukKazanclar.get(i)<ort) {
					System.out.println("Ortlamanin altindaki kazanc gunleri: "+ Market.gunler.get(i));
			}
		}
		
	}
	

}
