package day31_DateAndTime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		// Bir String ve bir int variable olusturalim
		// bir loop icerisinde bu variable'lari 1000 kere degistirelim
		// ve islem surelerini kiyaslayalim
		
		//Verilen iki dogum tarihinin hangisinin daha once oldugunu bulunuz
		
		
		LocalTime saat=LocalTime.now();
		System.out.println("baslangic saati" + saat); //
		
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
			
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati" + saatBitis);
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("int For loop " + (nanobitis-nano1) + "saniyede tamamladi");
		
		LocalTime saatS=LocalTime.now();
		System.out.println("baslangic saati" + saat); //
		
		
		String str="celil";
		
		for (int i = 0; i < 10000; i++) {
			str+=" ";
			
		}
		
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("bitis saati" + saatBitisS);
		
		double nanoS=saatS.getNano();
		double nanobitisS=saatBitisS.getNano();
		
		System.out.println("String For loop " + (nanobitisS-nanoS) + "saniyede tamamladi");
		
		
		double stringSure=nanobitisS-nanoS;
		double intSure=nanobitisS-nano1;
		
		System.out.println("int String'den " + (stringSure-intSure) + "nano saniye daha hizli bitirdi");
		
		
		

	
	}

}
