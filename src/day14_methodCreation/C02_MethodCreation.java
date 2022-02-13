package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		// sayilari karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter'a bakin");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girilen sayilarin kareler toplamini istiyorsaniz 2"
				+"\nkupler toplamini istiyorsaniz 3'e basin");
		
		int secim=scan.nextInt();
		
		switch(secim) {
		
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kupTopla(sayi1, sayi2);
			break;
		default:
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
		
		//kupTopla(sayi1,sayi2); bu argumandir
		
		//kareTopla(sayi1,sayi2); burda yazana arguman denir bunu method u olusturmak icin yaptik.kareTopla methodu olusturduk
		/*
		 * Bir methodu 4 adimda olustururuz
		 * 1-methodu javaya olusturtabilmek icin method call yapiyoruz
		 * 2-arguman ihtiyaci var mi belirleyelim
		 * 3-Javadan yardim alarak methodu olusturalim
		 * 4-access modifier ve return type a karar verelim
		 * bundan sonra methodun yapacagi islevi gerceklestirecek kodlarimizi yazariz
		 */
		
		
		
	}

	public static void kupTopla(double sayi1, double sayi2) {
		
		double kuplerToplami=sayi1*sayi1*sayi1 + sayi2*sayi2*sayi2;
		System.out.println("Girilen sayilarin kuplerinin toplami = " + kuplerToplami);
		
	}

	public static void kareTopla(double sayi3, double sayi4) { //burda yazana parametre denir
		// bizim arguman isimlerimizle, parametre isimlerimiz ayni olmak zorunda degil
		//java isimlere degil degerlere bakar
		//bu bir zorunluluk degil imkandir, istedigimizi tercih edebiliriz
		
		double karelerToplami=sayi3*sayi3 + sayi4*sayi4;
		System.out.println("Girilen sayilarin kareleri toplami = " + karelerToplami);
		
	}

}
