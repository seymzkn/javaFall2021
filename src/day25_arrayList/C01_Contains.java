package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {

		// Verilen bir array'de tekrar eden elementleri sadece birer tane yazarak
		// unique elementlerden olusan bir array haline getirelim
		
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,1,0,3,5};
		
		// 2,3,4,5,6,7,8,9,1,0
		
		List<Integer> tekrarsiz = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				
				tekrarsiz.add(arr[i]);
				
				}
			
		}
		System.out.println("tekrarsiz list : " + tekrarsiz); //[2, 3, 4, 5, 6, 7, 8, 1, 0] //bu List
		
		int tekrarsizArray[]= new int [tekrarsiz.size()]; //[0,0,0,0,0,0,0,0,0]
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i]=tekrarsiz.get(i);
			
		}
		
		System.out.println("tekrarsiz array : " + Arrays.toString(tekrarsizArray)); // [2, 3, 4, 5, 6, 7, 8, 1, 0] bu Array
		
		

	}

}
