package Alistirmalar;

import java.util.Scanner;

public class A10_NestedIf {
	public static void main(String[] args) {
		
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
		//calisan erkekse 65 yasindan buyukse emekli olabilir
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin E, kadin icin K ");
		
		char cinsiyet =scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi giriniz");
		double yas=scan.nextDouble();
		
		if (cinsiyet=='E') {
			if (yas>=65) {
				System.out.println("Emekli olabilirsin");
				
			} else {
				System.out.println("Emekli olamazsin");

			}
			
		} else if(cinsiyet=='K') {
			if (yas>=60) {
				System.out.println("Emekli olabilirsin");
				
			} else {
				System.out.println("Emekli olamazsin");

			}
		}else {
			System.out.println("Lutfen cinsiyet icin gecerli bir harf girin");

		}
	
	
	
	}
		
}
