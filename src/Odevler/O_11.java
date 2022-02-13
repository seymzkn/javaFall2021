package Odevler;

import java.util.Scanner;

public class O_11 {

	public static void main(String[] args) {
		// Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
        //Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise 
		//aynı olan harflerin birisini kaldırın
		//Örnek:      "abc", "cat" --> "abcat"
        // "abc", "dog"  -->"abcdog"
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki tane String giriniz");
		
		String str1=scan.next();
		String str2=scan.next();
		
		String birlesik=str1+str2;
		
		
		if ((str1.charAt(str1.length()-1))==(str2.charAt(0))) {
			System.out.println(str1.substring(0, str1.length()-1)+ str2);
			
			
			
			
		} else {
			System.out.println(birlesik);

		}

	}

}
