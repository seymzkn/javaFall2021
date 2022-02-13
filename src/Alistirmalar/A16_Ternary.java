package Alistirmalar;

import java.util.Scanner;

public class A16_Ternary {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin. Sayi pozitifse "Sayi pozitif yazdirin, 
		//negatifse sayinin karesini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi=scan.nextDouble();
		
		//sayi>0 ? System.out.println("sayi pozitif") : System.out.println(sayi*sayi);
		// Ternary'nin icerisine syso yazamayiz. Ternary de direk sonuc veya sonuc dondurecek bir islem yapabiliriz
		
		System.out.println(sayi>0 ? "sayi pozitif" : sayi*sayi);
	}

}
