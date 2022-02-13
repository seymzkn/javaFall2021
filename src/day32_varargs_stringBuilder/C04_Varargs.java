package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {

		
		KafanaGoreTopla(5,10,13,0);
		
		// Varargs'da hic eleman olmasa da java itiraz etmez
		// once int olarak tanimlanan sayilari eslestirir
		// kalan tum sayilari varargs'a doldurur
		
	}

	private static void KafanaGoreTopla(int sayi1, int sayi2, int sayi3, int sayi4, int... sayilar) {
		
		int toplam=0;
		
		for (int each : sayilar) {
			
			toplam+=each;
			
		}
		
		System.out.println("Ilk sayi ile digerlerinin toplaminin carpimi sonucu : " + sayi1* toplam);

	}

}
