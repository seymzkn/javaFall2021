package day29_staticBlocks_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// Biz 100 tl ye satilan bir urun icin2 farkli indirim uygulayan iki method olusturalim
		
				int fiyat=100;
				
				System.out.println(indirimYap25(fiyat)); //75
				System.out.println("methoddan sonra main metoddaki fiyat : " + fiyat); //100
				
				//indirimi kalici yapmak istiyorsaniz main methodda atama yapmaniz gerekir
				fiyat=indirimYap10(fiyat);
				System.out.println("methoddan sonra main metoddaki fiyat : " + fiyat); //100
			}

			private static int indirimYap25(int fiyat) {
				fiyat*=0.75;
				return fiyat;
				
			}

			private static int indirimYap10(int fiyat) {
				
				fiyat*=0.90;
				return fiyat;
		
	}

}

