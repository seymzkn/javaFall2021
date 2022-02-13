package Odevler;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
        Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
       - @ isareti icermiyorsa "gecersiz email" yazdirin 
       - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin 
       - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
       */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz");
		
		String email=scan.next();
		kontrol(email);
		
		
	}

	public static void kontrol(String email) {
		if (!email.contains("@")) {
			System.out.println("gecersiz email");
			
		} else if(!email.contains("@gmail.com")) {
			System.out.println("lutfen gmail adresinizi girin");
		
		}else if(!email.endsWith("@gmail")) {
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("email adresiniz basarili");

		}
		
		
	}

}
