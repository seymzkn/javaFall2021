package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Market {
	
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük 
	olarak gösteren bir program
	 * yazınız. Ayrıca bakkalın bu hafta ortalama 
	kazandığı miktarı gösteren bir
	 * method yazınız. Ayrıca bakkalın hangi günler 
	ortalamanın üstüne kazandığını
	 * gösteren bir method yazınız. Ayrıca bakkalın 
	hangi günler ortalamanın altında
	 * kazandığını gösteren bir method yazınız.
	 *
	 * 1. Adım : Günleri içeren bir tane ArrayList 
	oluşturun. (gunler) 
	 * 2. Adım : Günlük kazançları ekleyeceğimiz bir 
	tane ArrayList oluşturun.
	 * (gunlukKazanclar)
	 *  3. *  * Adım : While döngüsü ile kullanıcıdan 
	7 günlük
	 * kazançları tekek teker alıp gunlukKazanclar 
	ArrayList'e ekle. 
	 * 4. Adım : * getOrtalamaKazanc() adlı method ile
	ortalama kazancı alın. 
	 * 5. Adım :  * 
	getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
	for döngüsü ile
	 * tüm günleri ortalama kazanç ile karşılaştır 
	ortalama kazançtan yüksekse o
	 * günleri return yap. 6. Adım : 
	getOrtalamaninAltindaKazancGünleri() adlı
	 * method oluşturun. for döngüsü ile tüm günleri 
	ortalama kazanç ile karşılaştır
	 * ortalama kazançtan aşağıysa o günleri return 
	yap.
	 */
	
	static List <String> gunler= new ArrayList<>(Arrays.asList( "Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List <Double> gunlukKazanclar=new ArrayList<>(Arrays.asList());
	

	public static void main(String[] args) {
		
		double kazanc=0;
		
		
		for(int i=0; i<7;i++) {
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Lutfen "+ gunler.get(i) +" günü icin kazancinizi giriniz");
			kazanc=scan.nextDouble();
			
			gunlukKazanclar.add(kazanc);
					
			
		}
		
		
		System.out.println(gunlukKazanclar);
		System.out.println("Gunluk ortalama kazanc : " + Market_Methods.getOrtalamaKazanc());
		Market_Methods.getOrtalamaninUstundeKazancGünleri();
		Market_Methods.getOrtalamaninAltindaKazancGünleri();
		
	}
	

}
