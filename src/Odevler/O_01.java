package Odevler;

import java.util.Scanner;

public class O_01 {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		// verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
		// ve bitip bitmedigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Verilen cumle " + kelime + " ile basliyor");
			
		} else {
			System.out.println("Verilen cumle " + kelime + " ile baslamiyor");

		}
		
		if (cumle.endsWith(kelime)) {
			System.out.println("Verilen cumle " + kelime + " ile bitiyor");
			
		} else {
			System.out.println("Verilen cumle " + kelime + " ile bitmiyor" );
			

		}
		
	
		
		
	
		

	}

}
