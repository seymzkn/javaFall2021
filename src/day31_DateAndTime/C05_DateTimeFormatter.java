package day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		
		System.out.println(tarihSaat);//2021-12-02T21:44:29.344
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil saat.dakika
		
		
		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY EEE  HH : mm"); 
		
		System.out.println(duzenle.format(tarihSaat)); // 02 / 12 / 2021 Do  21 : 55
		
		/*
		  format olustururken
		  GUN
		  d : basta 0 varsa onu yazmadan gun numarasini yazar
		  dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		  DDD: yilin kacinci gunu oldugunu 
		  E, EE, EEE : gun isminin ilk uc harfi
		  EEEE : gun isminin tamamini
		  
		  AY (Ay icin M, dakika icin m kullanilir)
		  M : basta 0 varsa onu yazmadan ay numarasini yazar
		  MM : tek haneli gunleri 01 gibi basina sifir yazarak ay numarasi
		  MMM: Ay isminin ilk uc harfi
		  MMMM: Ay isminin tamami
		  
		  YY : yilin son iki rakamini
		  YYYY:yilin tamamini
		  
		  Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		  
		  HH : saatin tamami, tek rakamli saat olursa 02 gibi
		  H : tek rakamli saat olursa sadece saati
		  
		  a yazarsak AM veya PM degerini ekliyor
		
		 */
		
	
	
	}

}
