package day29_staticBlocks_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// Biz 100 tl ye satilan bir urun icin2 farkli indirim uygulayan iki method olusturalim
		
		int fiyat=100;
		
		indirimYap25(fiyat); //%25 indirimli fiyat :75
		System.out.println("methoddan sonra main metoddaki fiyat : " + fiyat); //100
		indirimYap10(fiyat);
		System.out.println("methoddan sonra main metoddaki fiyat : " + fiyat); //100
	}

	private static void indirimYap25(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);
		
		
	}

	private static void indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
		
	}

}
