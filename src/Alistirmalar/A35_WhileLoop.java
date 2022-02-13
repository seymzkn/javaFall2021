package Alistirmalar;

import java.util.Scanner;

public class A35_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayi isteyin
				// kullanici sifira basincaya kadar sayilari alip
				// toplamaya devam edin
				// kullanici sifira bastiginda
				// o ana kadar 0 haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
				
				//kullanicidan 5 sayi alin dese bunu for loop ile yapabiliriz
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=100;
		int toplam=0;
		int sayac=0;
		
		while (sayi!=0) {
			System.out.println("Lutfen toplamak istediginiz sayilari girin\n bitirmek icin 0 a basin");
			
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		}
		System.out.println("Girilen sayi adedi :" + (sayac-1));
		System.out.println(toplam);
			
		}
		
		

	}

