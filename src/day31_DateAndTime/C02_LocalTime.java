package day31_DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		System.out.println("baslangic saati" + saat); //21:03:27.849
		
		
		int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			sayi++;
			
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati" + saatBitis);
		
		//Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		//HEm basinda, hem de sonunda LocalTime objesi olusturmaliyiz
		
		System.out.println(saat.getNano()); // 
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For loop " + (nanobitis-nano1) + "saniyede tamamladi");
		
		System.out.println(saat.getMinute()); //28
		System.out.println(saat.plusMinutes(10000)); //20:10:04.272
		
		System.out.println(saat.minusHours(20)); //01:31:42.735
		
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat); //23:35:23.965
		
		


	}

}
