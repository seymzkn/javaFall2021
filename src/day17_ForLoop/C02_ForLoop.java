package day17_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		//Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir String giriniz...");
        
        String str=scan.nextLine();
        
        //cekoslavakyalilastiramadiklarimizdanmisiniz
        
        for (int i = str.length()-1; i>=0; i--) {
        	
        	System.out.print(str.substring(i,i+1));
			
			
		}
       
        scan.close();

	}

}
