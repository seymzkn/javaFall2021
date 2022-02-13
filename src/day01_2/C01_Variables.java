package day01_2;

public class C01_Variables {

	public static void main(String[] args) {
		/* 1- 3 farkli data turunde variable olusturun ve bunlari yazdirin
		 * 2-isim ve soyisim icin iki variable olusturun ve bunlari
		 * isminiz: Mehmet
		 * soyisminiz: Bulutluoz seklinde yazdirin
		 * 3-iki farkli tamsayi data turunde 2 variable
		 * olusturun bunlarin toplamini yazdirin
		 * 4-bir tamsayi ve bir ondalikli 
		 * variable olusturun ve bunlarin toplamini yazdirin
		 * 5-char data turunde bir variable olusturun ve yazdirin
		 * 6-bir tamsayi bir de char degisken olusturun
		 * ve bunlarin toplamini yazdirin
		 */

		String isminiz="Mehmet Bulutluoz";
		System.out.println(isminiz);
		
		//char data turunde bir variable olusturun ve yazdirin
		char ilkHarf='s';
				
		boolean anlasildiMi=true;
		
		String ismim= "Ali";
		String soyisminiz="Tuskan";
		
		//isminiz: Mehmet
		System.out.println("isminiz : " + isminiz);
		
		//soyisminiz: Bulutluoz
		System.out.println("soyisminiz : " +soyisminiz);
		
		//3-iki farkli tamsayi data turunde 2 variable
		//olusturun bunlarin toplamini yazdirin
		
		int a=10;
		short b=20;
		
		System.out.println(a+b); //30
		
		//bir tamsayi bir de char degisken olusturun
		// ve bunlarin toplamini yazdirin
		
		int sayi=25;
		char karakter='a';
		
		//char degiskenler matematiksel isleme sokulursa char degiskenin barindirdigi
		//ascii degeri isleme girer (a=97)
		System.out.println(sayi+karakter); //122
		
		
		
		
		
	
	}

}
