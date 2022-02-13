package Odevler;

import java.util.Scanner;

public class O_05 {

	public static void main(String[] args) {
		/* Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
			*
			**
			***
			****
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Potizif bir rakam giriniz");
		
		int rakam=scan.nextInt();
		
		for (int satir=1 ; satir <= rakam; satir++) {
			
			for (int i = 1; i <=satir ; i++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
