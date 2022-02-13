package Alistirmalar;

public class A18_nestedTernary {

	public static void main(String[] args) {
		// Verilen harfi inceleyin kucuk harf ise consola "Kucuk harf"
		//buyuk harf ise "Buyuk Harf 
		//yoksa "girdiginiz karakter harf degil" yazdirin
		
		char krk='Z';
		
		//krk>='a' && krk<='z' ? "Kucuk Harf" : (//sart yanlis ise sonuc)
		String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
				(krk>='A' && krk <='Z') ? "Buyuk Harf" : "Girilen karakter harf degil"
				);
		
		System.out.println(sonuc);

	}

}
