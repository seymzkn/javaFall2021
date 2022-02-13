package Alistirmalar;

import java.util.Scanner;

public class A_36_Method {

	public static void main(String[] args) {
		// girilen sayinin asal sayi olup olmadigini yazdiran method yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kontrol etmek istediginiz sayiyi giriniz");
		
		int sayi=scan.nextInt();
		
		asalSayi(sayi);
		
		

	}

	private static void asalSayi(int sayi) {
		int sayac=0;
		
		for (int i = 2; i < sayi; i++) {
			
			if (sayi%i==0) {
				System.out.println("asal sayi degil");
				sayac++;
				break;
				
			}
				
				
				
			}
		if (sayac==0) {
			System.out.println("Asaldir");
			
			
		}
		
		
	}

}
