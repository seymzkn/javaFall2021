package Alistirmalar;

public class AA4 {

	public static void main(String[] args) {
		// SORU 1 verilen iki sayinin toplamini ve carpimini
		// yapip yazdiran iki ayri method olusturun
		
		
		
		int a=45;
		int b=78;
		
		toplam(a,b);
		carpim(a,b);
		

	}

	public static void carpim(int a, int b) {
		System.out.println("sayilarin carpimi : " + (a*b));
		
	}

	public static void toplam(int a, int b) {
		System.out.println("sayilarin toplami : " + (a+b));
		
		
	}

}
