package day04_IncrementDecrement;

public class C07_PreDecrementPostDecrement {

	public static void main(String[] args) {
		
		int sayi=10;
		
		sayi--;
		
		System.out.println(sayi); //9
		
		int a=sayi--;
				
				System.out.println(a); //9 sayi sonra 8 oldu, once atama sonra azaltma oldu
				System.out.println(sayi); //8
				
				System.out.println(--a);//8 once azaltacak sonra yazdiracak

	}

}