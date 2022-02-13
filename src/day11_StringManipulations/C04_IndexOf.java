package day11_StringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// parametre olarak girilen bir char veya string in 
		// ilk indexìni verir
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); //4
		System.out.println(str.indexOf("J")); //14
		
		int index=str.indexOf("r"); //indexOf() methodu bize her zaman int bir deger doner
		
		System.out.println(index); //6
		
		System.out.println(str.indexOf('q')); //-1
		//Bir String icinde olmayan bir karakter veya kelime ararsak java bize -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A')); //-1
		
		System.out.println(str.indexOf("Java")); //14 	//parametre kelime olabilir fakat illa anlamli bir kelime olmasina gerek yok 
														//"va og" yazsak da olurdu 16 olurdu sonuc
		System.out.println(str.indexOf("va og")); //16 
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
		//bu durumda Java aradigimiz CSì tek bir paket gibi dusunur ve o paketin baslangic indexìni bize verir
		
		System.out.println(str.indexOf('a',11)); //15 z den sonraki ilk a yi alir
		
		
	}

}
