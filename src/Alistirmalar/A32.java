package Alistirmalar;

import java.util.Scanner;

public class A32 {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi alin
		//ilk sayidan baslayarak , ikinci sayiya kadar ucer ucer yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz birinci sayidan sonra entere basiniz");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		
		if (sayi1>sayi2) {
			for (int i = sayi1;  i>=sayi2; i-=3) {
				System.out.print(i + " ");
				
			}
			
			
		} else if(sayi1<sayi2){
			for (int i = sayi1; i <=sayi2; i+=3) {
				System.out.print(i + " ");
				
			}
			

		}else {
			System.out.println("girilen sayilar esit");
			
		}

	}

}
