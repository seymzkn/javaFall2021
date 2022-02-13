package day22_BinarySearch;

import java.util.Arrays;

public class C01_Arrays {

	public static void main(String[] args) {
	
		String isimler[] = {"Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
		
		//Isimler array'inde Murat ismi var mi?
		
		//array'de arama yapmadan once siralama yapmaliyiz
		
		Arrays.sort(isimler);
		//arrayss class i ile sort yaptigimizda array'imizi kalici olarak degisir
		
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, Murat, ainagul]
		// sort method'u elementleri natural order'a gore siralar
		
		isimler[4]="Ainagul";
		System.out.println(Arrays.toString(isimler)); //[Emine, Hacer, Kutlu, Murat, Ainagul]
		
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));//[Ainagul, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat"));//4
		
		System.out.println(Arrays.binarySearch(isimler, "Mehmet"));//-5
		
		System.out.println(Arrays.binarySearch(isimler, "Tuba")); //-6
		
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); //-4
		
		

	}

}
