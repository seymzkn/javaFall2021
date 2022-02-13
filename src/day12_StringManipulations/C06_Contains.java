package day12_StringManipulations;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {
		//Soru 1) Kullanicidan email adresini girmesini isteyin, 
		//mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, 
		//@gmail.com ile bitiyorsa “Email adresiniz kaydedildi “ , 
		//@gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen email adresinizi giriniz");
		
		String email=scan.next();
		
		int uzunluk=email.length();
		int index=email.lastIndexOf("@gmail.com");
		
		
		if (!email.contains("@gmail") || (index==0)) {
			System.out.println("Lutfen gmail adresini giriniz");
			
		} else if(index>=uzunluk-10){  //@gmail.com 10 harften olusuyor bu nedenle eksi 10 yaptik
			System.out.println("Email adresiniz kaydedildi");
		

		}else {
			System.out.println("Lutfen yazimi kontrol edin");
	
		}
		}

}
