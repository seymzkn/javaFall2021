package day13_StringManipulations;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen 16 karakterli kredi karti numaranizi bosluk birakmadan yaziniz");
		String kkNo=scan.next();
		
		String isimFormatli=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimFormatli=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
		
		String kkFormatli="**** **** ****" + kkNo.substring(12);
		
		
		System.out.println("isim-soyisim : " + isimFormatli + " " + soyisimFormatli);
		System.out.println("kart no : " + kkFormatli);


	}

}
