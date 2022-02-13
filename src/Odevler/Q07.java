package Odevler;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		 /*
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, 
         * yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar         0->9
             \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
         2) \\w   ==> A->Z        a->z
             \\W  ==> A->Z        a->z     tum harf disi character ler
         3) \\s   ==> space
             \\S   ==> space disindaki hersey
     */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen adinizi giriniz");
		
		String isim=scan.next();
		
		System.out.println("Lutfen soyadinizi giriniz");
		String soyisim=scan.next();
		
		System.out.println("Lutfen 16 karakterli kredi karti numaranizi bosluk birakmadan yaziniz");
		String kkNo=scan.next();
		
		String isimYildizli=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		System.out.println(isimYildizli);
		
		String soyisimYildizli=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
		System.out.println(soyisimYildizli);
		
		String kkNoYildizli="**** **** ****" + kkNo.substring(12);

		if (kkNoYildizli.length()!=16) {
			System.out.println("Geçersiz kredi karti numarasi");
			
		} else {
			System.out.println("**** **** ****" + kkNo.substring(12));

		}
	
	}

}
