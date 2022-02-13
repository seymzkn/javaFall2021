package Alistirmalar;

import java.util.Scanner;

public class A06_IFElseIf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli bir gun ise
		//gun isminin 1. 2. ve 3. harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin
		//gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen gun ismi giriniz");
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazar") || gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba")|| 
				gun.equals("persembe") || gun.equals("cuma") || gun.equals("cumartesi")) {
			
			System.out.println("girdiginiz gün :" + gun + "\n1.harfi :" + gun.toUpperCase().charAt(0) + "\n2. harfi :"
                    + gun.toLowerCase().charAt(1) + "\n3. harfi :" + gun.toLowerCase().charAt(2));
			
			
		} else {
			System.out.println("Gecerli gun ismi giriniz");

		}

	}

}
