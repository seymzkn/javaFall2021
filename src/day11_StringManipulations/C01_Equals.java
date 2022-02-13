package day11_StringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		
		int a=10;
		int b=a + 0;
		
		System.out.println(a==b); //true yazdirir
		
		char ch1='K';
		char ch2= 'K' + 0;
		
		System.out.println(ch1==ch2); // true yazdirir, cunku char variable lar matematiksel isleme girerlerse ascii degerini kullanirlar. 
									//K nin ascii degeri neyse onu alir. int ve char da objectleri degistirsek de degismez
		
		String str1="Ali";
		String str2 ="Can";
		String str3="Ali Can";
		String str4=str1 + " " + str2;
		
		System.out.println(str4); //Ali Can
		System.out.println(str3==str4); //false , degerleri aynidir esittir fakat referanslarina baktiginda referanslar esit degildir.farkli objelerdir. bu yuzden sonuc false olur
		
		System.out.println(str3.equals(str4)); //true equals sadece degerlere bakar bu yuzden true yazdirir.
		
		//String variable larda == hem degere hem referansina bakar dolayisiyla objeler farkli oldugunda
		//genelde false doner
		//str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
		//eger case sensetive olarak String degerleri ayni ise true doner

	}

}
