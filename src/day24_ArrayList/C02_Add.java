package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List<String> isimler= new ArrayList<>();
		System.out.println("Bos Liste : " + isimler);
		
		isimler.add("Ali");
		System.out.println("Bir eleman : " + isimler);
		
		isimler.add("Veli");
		System.out.println("Iki eleman : " + isimler);
		//add method'u listenin sonuna ekleme yapar
		
		
		isimler.add("Can");
		System.out.println("Uc eleman : " + isimler);
		
		isimler.add(1, "Ayse");
		System.out.println("1. indexe ayse ekledik : " + isimler);
		
		// isimler.add(5) declare ederken belirttigimiz data turu disinda bir data turunden ekleme yapamayiz
		
		List<String> liste2= new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		
		System.out.println("liste2 : " + liste2);
		
		isimler.addAll(4, liste2);
		System.out.println("liste2 yi ekledik : " + isimler);
		
		isimler.addAll(liste2);
		System.out.println("index olmadan liste 2 yi tekrar ekledik : " + isimler );

	}

}
