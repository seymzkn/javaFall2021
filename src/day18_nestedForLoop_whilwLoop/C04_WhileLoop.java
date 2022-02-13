package day18_nestedForLoop_whilwLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayi isteyin
		// kullanici sifira basincaya kadar sayilari alip
		// toplamaya devam edin
		// kullanici sifira bastiginda
		// o ana kadar 0 haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		//kullanicidan 5 sayi alin dese bunu for loop ile yapabiliriz
		
		for (int i = 1; i <=5; i++) {
			//kullanicidan bir deger alip , toplama eklerim
			
		}
		
		Scanner scan=new Scanner(System.in);
		// loop'un icinde kullanacagim obje ve variable'lari
		// loop'dan once olusturmak daha guzeldir
		//cunku loop un icinde olusturursak, 
		//loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
		
		int sayi=100; //Kullanicidan sayi al. 0 disinda bir sey verdik
		int toplam=0; //aldigim sayiyi toplama ekle
		int sayac=0; //girilen sayi adedini tutacak variable lazim
		
		while (sayi!=0) {
			
			System.out.println("Lutfen toplama eklemek icin bir tam sayi yazin \nbitirmek icin 0'a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		
		//kullanici 0'a bastiginda loop sonuna ilerini son kez yapip
		//sonra basa donecek ve loop bitecek
		//0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden
		//sifiri sayac'a eklememek icin 44. satirda sayac-1 yaptik
		
		System.out.println("Girilen sayi adedi : " + (sayac-1)); //0'a bastigimizda da sayacagi icin saya-1 yaptik
		
		System.out.println("Girilen sayilarin toplami : " + toplam);
		
		

	}

}
