package Alistirmalar;

import java.util.Scanner;

public class A05_IfElse {

	public static void main(String[] args) {
		// Kullanicidan yasini sorun, eger yas 65 den kucukse "emekli olamazsin, calismalisin"
		//65 e esit veya buyukse "Emekli olabilirsin" yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen yasinizi giriniz");
		
		int yas=scan.nextInt();
		
		if (yas<65) {
			System.out.println("emekli olamazsin, calismalisin");
			
		} else {
			System.out.println("emekli olabilirsin");

		}
		

	}

}
