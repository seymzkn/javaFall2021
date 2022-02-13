package Alistirmalar;

import java.util.Scanner;

public class AA6 {

	public static void main(String[] args) {
			// Soru 3 ) Interview Question Kullanicidan bir String isteyin 
		    //   ve Stringi tersine ceviren bir method yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir String giriniz");
		
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			System.out.print(str.substring(i, i+1));
		}
		
		

	}

}
