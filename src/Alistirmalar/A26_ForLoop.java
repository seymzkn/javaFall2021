package Alistirmalar;

import java.util.Scanner;

public class A26_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 100den kucuk tamsayi isteyin
		//1 den baslayarak girilen sayiya kadar sayi dahil 3 un kati olan sayilari yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
		
		double num=scan.nextDouble();
		int sayi=(int) num;
		
		if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
			
		} else if(sayi!=num) { //kullanici double girdi demektir
			System.out.println("Lutfen tam sayi giriniz");
		}else if(sayi>100) {
			System.out.println("Lutfen 100 den kucuk sayi giriniz");
		}
		
			{
			
			for (int i = 1; i <=num; i++) {
				if (i%3==0) {
					System.out.println(i + " ");
					
				}
			}
			
		}
		}

	}


