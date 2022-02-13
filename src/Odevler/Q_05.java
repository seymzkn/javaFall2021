package Odevler;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		// Kullanicidan ismini ve soyismini isteyin
		// iki farkli method olusturun methodlardan biri girilen kelimeleri birlestirsin
		//ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		//ikinci method isim ve soyismin ilk harflerini buyuk harf
		//kalan harfler * olacak sekilde birlestirsin
		
		//kullanicinin ismini acik olarak yazilmasini veya gizlenmesi etrcihi sorun
		//ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isim ve soyisminizi girin \nisimden sonra entere basin");
		
		String isim=scan.next();
		String soyisim=scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
				+ "\nilk harf haric gizli yazilmasini istiyorsaniz 2 ye basin");
		
		int tercih=scan.nextInt();
		
		String birlesmisIsim=null; //Emrah saglam ya da E**** S**** olacak
		
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim,soyisim);
			
		} else if(tercih==2) {
			birlesmisIsim=isimGizle(isim,soyisim);
		}else {
			System.out.println("Lutfen 1 veya 2 secin");

		}
		System.out.println("Kullanicinin tercihi : " + birlesmisIsim);
		//acikIsim(isim,soyisim);
		//isimGizle(isim, soyisim);
	
	
	
	}

	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyisim ;
		
		
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		
		
		return isim+" "+soyisim;
		
		
	}

}
