package Alistirmalar;

import java.util.Scanner;

public class A30_ForLoop {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question Kullanicidan 10�dan kucuk bir tamsayi isteyin ve 
				//girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)
				
				Scanner scan = new Scanner(System.in);
		        System.out.println("Faktoryel hesaplamak icin 10'dan kucuk bir tam sayi giriniz...");
		        
		        int sayi=scan.nextInt();
		        System.out.println(sayi + "!=");
		        
		        int faktoryel=1;
		        
		        for (int i = sayi; i >1 ; i--) {
		        	faktoryel*=i;
					System.out.print(i + "*");
				}
		        System.out.print("1=" + faktoryel);

	}

}
