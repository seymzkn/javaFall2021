package day13_StringManipulations;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		// Verilen cumlenin verilen kelime(char squence) ile baslayip baslamadigini
		//ve bitip bitmedigini yazdirin
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		 
		 System.out.println("Lutfen bir kelime giriniz");
		 String kelime=scan.next().toLowerCase();
		 
		 if (cumle.startsWith(kelime)) {
			 System.out.println("Girilen cumle " + kelime + " ile basliyor");
			
		} else {
			System.out.println("girilen cumle " + kelime + " ile baslamiyor");

		}
		 
		 if (cumle.endsWith(kelime)) {
			 System.out.println("Girilen cumle " + kelime + " ile bitiyor");
			
		} else {
			System.out.println("girilen cumle " + kelime + " ile bitmiyor");

		}
		 scan.close();
		 
	}

}
