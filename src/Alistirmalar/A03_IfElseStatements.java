package Alistirmalar;

import java.util.Scanner;

public class A03_IfElseStatements {

	public static void main(String[] args) {
		// Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// Dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu giriniz");
		
		double kenar1=scan.nextDouble();
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu giriniz");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Bu dikdortgen bir karedir");
			
		} else {
			System.out.println("Bu dikdortgen bir kare degildir");

		}

	}

}
