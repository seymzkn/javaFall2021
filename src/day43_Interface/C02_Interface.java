package day43_Interface;

public interface C02_Interface {
	
	void motor(); 	// normal class larda access modifier yazmazsaniz java default access mod. kabul eder
					// interface de ise acc mod yazmazsaniz java public olarak kabul eder

	int sayi=10; // public, static ve final kabul etti
	
	// Interface de body si olan bir method yazmak isetrseniz 
	// Java size iki alternatif sunar
	// 1- Methodun basina "default" keyword yazabilirsiniz$
	//    Ancak burada yazilan default access modifier degil javanin interface icin ozel kabul ettigi bir keyworddur
	
	public default void kaporta() {
		System.out.println("default keyword sayesinde body olusturabildim ");
		
	}
	
	public static void sanzuman() {
		System.out.println("static keyword ile body olusturabilierim");
		
		
	}
}
