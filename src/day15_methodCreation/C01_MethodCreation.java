package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki kelime isteyin
		//iki farkli method olusturun methodlardan biri girilen kelimeleri
		//ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		//ikinci method Isim ve soyisim ilk harfleri buyuk harf 
		//kalan harfler * olacak sekilde birlestirsin
		
		//Kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		//ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra enter'a basin");
	
		
		//acikIsim(isim, soyisim); bunu en son sildik
		
		//isimGizle(isim, soyisim);
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
							+ "\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e); basin");
		
		int tercih=scan.nextInt(); //kullaniciya tercih sordum ve bunu boyle kaydettim
		//bu satira kadar kullanicidan ismini, soyismini ve tercihini aldim
		
		String birlesmisIsim=null; //once null verdik simdilik bos dursun Seyma Ozkan olacak ya da S**** O**** olacak
		
		if (tercih==1) {
			birlesmisIsim= acikIsim(isim,soyisim);			
		
		} else if(tercih==2) {
			birlesmisIsim= isimGizle(isim,soyisim);
		
		}else {
			System.out.println("Lutfen 1 veya 2 secin");

		}
		//Bu satirdan itibaren kullanicinin isim ve soyismi kullanici tercihine bagli olarak
		//kaydedildi
		
		System.out.println("kullanicinin tercihi : " + birlesmisIsim);
		
		

	}

	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w","*");
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*" );
		return isim+" "+soyisim ;
		
		
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim+" "+soyisim ;
		
		
		
		
	}

}
