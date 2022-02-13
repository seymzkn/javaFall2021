package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		//verilen array'i Arrays class'indan yardim alarak
		//list'e cevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println("List : " + arraydenList);
		
		//arraydenList.add("F"); //RTE
								//CTE olmasi icin syntax'te problem olmasi lazim,ancak bu yazimda
								//syntax hatasi yok
		
		//bu sekilde Arrays class'indan yardim alarak arrayi list e cevirirsek
		//olusturdugumuz list'in boyutu sabit olur
		//dolayisiyla add() veya clear() gibi methodlari calistirmak istersek
		//UnsupportedOperationException : Desteklenmeyen islem verir
		
		arr[1]="Z";
		System.out.println("Array'i degistirdikten sonra array : " + Arrays.toString(arr)); //[A, Z, C, d]
		System.out.println("Array'i degistirdikten sonra List : " + arraydenList); //[A, Z, C, d]
		
		arraydenList.set(3, "D");
		System.out.println("Listi degistirdikten sonra List : " + arraydenList); //[A, Z, C, D]
		System.out.println("List'i degistirdikten sonra array : " + Arrays.toString(arr)); //[A, Z, C, D]
		
		
		
		
		
	}

}
