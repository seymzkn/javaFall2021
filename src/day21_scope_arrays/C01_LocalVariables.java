package day21_scope_arrays;

public class C01_LocalVariables {
	
	String okulIsmi;

	public static void main(String[] args) {
		// Java lokal variable'lara default deger atamasi yapmaz
		//Kodlarimizda sorun yasamamak icin
		//olusturdugumuz lokal variable'lara uygun bir deger atamamizda fayda var
		
		int sayi=0; // int sayi; dersek java CTE veriyor
		System.out.println(sayi);
		
		//int sayi;// bir lokal'de ayni isimde birden fazla variable OLUSTURULAMAZ
		//String sayi;//data turu farkli olsa da Java buna izin vermez
		
		@SuppressWarnings("unused")
		String isim="Ali";
		
		

	}
	
	public static void staticMethod() {
		//sayi; 	//bir lokal'de olusturulan variable (methodlarin static olup olmamasina 
				// bagli olmaksizin)farkli lokal'de kullanilamaz.
		@SuppressWarnings("unused")
		String isim="Veli";
	}

}
