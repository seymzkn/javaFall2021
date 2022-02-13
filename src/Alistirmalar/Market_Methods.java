package Alistirmalar;

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
	
	public static void getOrtalamaninUstundeKazancGunleri() {
		
		for (int i = 0; i < 7; i++) {
			
			if (Market.gunlukKazanclar.get(i)>ort) {
				System.out.println("Ortalamanin ustundeki kazanc gunleri : " + Market.gunler.get(i));
				
			}
			
		}
		
		
	}

	public static void getOrtalamaninAltindaKazancGunler() {
		
			for (int i = 0; i < 7; i++) {
			
			if (Market.gunlukKazanclar.get(i)<ort) {
				System.out.println("Ortalamanin altindakiki kazanc gunleri : " + Market.gunler.get(i));
				
			}
			
		}
		
		
	}
	
	
	

}
