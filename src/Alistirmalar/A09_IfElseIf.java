package Alistirmalar;

import java.util.Scanner;

public class A09_IfElseIf {

	public static void main(String[] args) {
		// Soru 8) Kullanicidan maas icin bir teklif isteyin 
				//ve asagidaki degerlere gore cevap azdirin.
				//Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		        //60 – 80.000 arasinda ise “Konusabiliriz”, 
		        //60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen maas teklifini giriniz");
		
		int teklif=scan.nextInt();
		
		if (teklif>80.000) {
			System.out.println("Kabul ediyorum");
			
		} else if(teklif>60.000) {
			System.out.println("Konusabiliriz");
		}
		else {
			System.out.println("Maalesef kabul edemem");

		}
		

	}

}
