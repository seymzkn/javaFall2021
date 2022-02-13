package day12_StringManipulations;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine(); //cumlenin tamamini almasi icn line yaptik
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index= cumle.indexOf(krk); //burasi girilen karakterin cumledeki indexini verir
		
		if (index<0) {
			System.out.println("Girdiginiz harf verilen cumlede yok"); //bir harf index olarak -1 dondururse demek ki o harf cumle de yoktur. o nedenle <0. ya da index==(-1) yazabiliriz
		}else {
			System.out.println("Girdiginiz harf verilen cumlede var");
			
		}
		

	}

}
