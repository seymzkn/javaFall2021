package Alistirmalar;

import java.util.Scanner;

public class a38_WhileLoop {

	public static void main(String[] args) {
		// Kullamicidan bir sayi alin
		//ve bu sayiyi tam bolen sayilari
		//ve toplam kac tane olduklarini ekranda yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bolenlerini bulmak icin pozitif bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1; //baslangic degeri
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen + " ");
				sayac++;
				
				
			}
			bolen++;
			
		}
		System.out.println("");
		System.out.println(sayi + " sayisinin" + sayac + "adet tam boleni vardir");
		
		

	}

}
