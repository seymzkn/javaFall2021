package day11_StringManipulations;

public class C03_Length {

	public static void main(String[] args) {
		
		String str1="Ali Kahyaoglu";
		
		System.out.println(str1.length()); //13
		
		//verilen stringìn son harfini yazdirin
		
		//System.out.println(str1.charAt(12)); 
		//u kelime degisse de benim kodum calisacak 
		//5 harfli de girse on harfli de girse calisacak 
		//buna dinamik yapi diyoruz

		System.out.println(str1.charAt(str1.length()-1)); //u icerdeki parantez son harfin index idir. length-1
		
		String str2="";
		System.out.println(str2.length()); //0
		
		String str3=null; 	// null degeri bizim bu variable i bilerek olusturdugumuzu
							// ve bilerek deger atamadigimizi belirtiyor
							//System.out.println(str3.length()); // java.lang.NullPointerException
		
		String str4;
		System.out.println(str3); //null
		//System.out.println(str4); //Eger String i olusturur ama deger atamazsak yazdirdigimizda hata aliriz.
		
		//null pointer olusturdugumuz fakat sonra kullanacagimiz bir String i isaretlemek icin kullanilir
		//Bir String i yazdirgimizda null cikiyordsa Türkce olarak 
		//"Ben bu degiskeni olusturdum fakat henüz deger atamadim" demek istiyor
		
	}

}
