package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = �Hafta sonu�
                        gun=Sali output = �Hafta ici�
         *** String icin equals method�unu kullanin
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz");
		
		String gun=scan.next().toLowerCase();
		
	
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
			
			
		}
		if (gun.equals("pazartesi")|| gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
			
		}
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")) {
			System.out.println("Hafta ici");
			
			}
		
		//String non-primitive oldugu icin == kullanilmaz bunun yerine equals() kullanilmalidir
		
		
		
		
		//String non-primitive oldugu icin == kullanilamaz bunun yerine equals() kullanilmalidir
		
		
	}

}
