package Alistirmalar;

import java.util.Scanner;

public class A39_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen rakamlari toplamini yazdirmak uzere pozitif bir tam sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int rakamlarToplami=0;
		int rakam=0;
		
		
		
		while (sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
			
		}
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);

		
		  
		
	}

}
