package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin 
		//eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin. D
		//iger durumlarda ekrana �Eskenar degil� yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen ucgenin bir kenar uzunluklarini yaziniz \nilk kenari girdikten sonra diger kenarlar icin enter'e basin");
			
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("Eskenar ucgen");
			
		} else {
			System.out.println("Eskenar ucgen degil");

		}
		
		scan.close();
				
}

}
