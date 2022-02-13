package Alistirmalar;

import java.util.Scanner;

public class A21 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harflerini büyük 
		//		diğer harflerini küçük harf olarak ekrana yazdıran programı yazınız

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen isim ve soyisiminizi arada bor bosluk birakarak giriniz");
		
		//seyma nur özkan-Seyma Özkan
		String isim=scan.nextLine();
		isim.toLowerCase();
		char ch1=isim.toUpperCase().charAt(0);
		String isimB=ch1+isim.substring(1, isim.length());
		System.out.println(isimB);
		
	}

}
