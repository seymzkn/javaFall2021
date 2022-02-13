package Odevler;

import java.util.Scanner;

public class O_04 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. 
		//Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu,
		//ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		tekCift(sayi);
		buyukKucuk(sayi);
		yuz(sayi);
		
		

	}

	public static void yuz(int sayi) {
		if (sayi>100) {
			int birler=sayi%10;
			int onlar=(sayi/10)%10;
			int yuzler=sayi/100;
			System.out.println("Girilen sayinin rakamlari toplami : " +(birler+onlar+yuzler));
			
		} else if(sayi<100) {
			int birler=sayi%100;
			System.out.println("Girilen sayinin birler basamagindaki sayi : " + birler);

		}else {
			System.out.println("Sayi 100'e esittir");
			
		}
	
		
	}

	
	
	
	public static void buyukKucuk(int sayi) {

		if (sayi>0) {
			System.out.println("Girilen sayi : " + sayi + "sifirdan buyuktur");
	

		}else if(sayi==0) {
		System.out.println("Girilen sayi sifirdir");
		
		}else {
			System.out.println("Girilen sayi : " + sayi + "sifirdan kucuktur");
		}
			
		
		
	}

	public static void tekCift(int sayi) {
		if (sayi%2==0) {
			System.out.println("Girilen sayi : " + sayi + "cift sayidir");
			
		} else {
			System.out.println("Girilen sayi : " + sayi + "tek sayidir");

		}
		
		
	}

}
